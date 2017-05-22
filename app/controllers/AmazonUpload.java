package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.S3File;
import play.Logger;
import play.Routes;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import plugins.S3Plugin;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

import static play.libs.Json.toJson;


/**
 * Created by vshir on 18.05.2017.
 */
public class AmazonUpload extends Controller{
    private static final String AWS_ACCESS_KEY = "aws.access.key";
    private static final String AWS_SECRET_KEY = "aws.secret.key";
    private static final String AWS_S3_BUCKET = "aws.s3.bucket";
    private UUID id;
    private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");


    public static Result index() {
       return redirect(routes.AmazonUpload.upload());
   }

    public static Result upload() throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        List<S3File> uploads = Auth.currentUser().getList();
        String s3Bucket = S3Plugin.s3Bucket;
        UUID id = UUID.randomUUID();
        String accessKey = S3Plugin.getKey();
        String acl = "public-read";
        String success_action_redirect = "localhost:9000/uplode";
        Logger.info(accessKey);
        TimeZone tz = TimeZone.getTimeZone("UTC");
        df.setTimeZone(tz);

        String nowAsISO = df.format(System.currentTimeMillis());
        Logger.info(nowAsISO);
        String policy_document = "{ 'expiration': '"+nowAsISO+"',\n" +
                "   'conditions': [ \n" +
                "    {'bucket': '"+s3Bucket+"'}, \n" +
                "    ['starts-with','"+id.toString()+"', '"+id.toString()+"'],\n" +
                "    {'acl': 'public-read'},\n" +
                "    {'success_action_redirect': 'http://localhost:9000/uplode'},\n" +
                "    ['starts-with', '$Content-Type', ''],\n" +
                "  ]\n" +
                "}";
        String policy = DatatypeConverter.printBase64Binary(policy_document.getBytes("UTF-8")).replaceAll("\n","").replaceAll("\r","");
        String signature = S3Plugin.getHMac(policy);
        return ok(views.html.upload.index.render("https://"+s3Bucket+".s3.amazonaws.com",id.toString()+"/",accessKey,acl,success_action_redirect,policy.toString(),signature.toString()));
    }

    private static Result errorJsonResult(String errorMessage) {
        return badRequest(errorJson(errorMessage));
    }
    private static JsonNode errorJson(String errorMessage) {
        return Json.newObject().put("error", errorMessage);
    }
    public static Result getInfo() {
        return ok(toJson(S3Plugin.s3Bucket));  //toJson преобразует объект или список объектов в соответствующий JSON
    }




public static Result jsRoutes() {
        response().setContentType("text/javascript");
        return ok(
                Routes.javascriptRouter("jsRoutes",
                        controllers.routes.javascript.AmazonUpload.upload(),
                        controllers.routes.javascript.AmazonUpload.getInfo()
                        //todo добавить в роутер необходимые контроллеры для API - создание записи, редактирование, удаление...
                )
        );
    }
}
