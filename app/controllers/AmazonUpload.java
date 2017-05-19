package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.S3File;
import play.Routes;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import plugins.S3Plugin;
import views.html.index;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.print.DocFlavor;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.UUID;


import play.Application;

import static play.libs.Json.toJson;


/**
 * Created by vshir on 18.05.2017.
 */
public class AmazonUpload extends Controller{
    private static final String AWS_ACCESS_KEY = "aws.access.key";
    private static final String AWS_SECRET_KEY = "aws.secret.key";
    private static final String AWS_S3_BUCKET = "aws.s3.bucket";
    private UUID id;



   public static Result index() {
       return redirect(routes.AmazonUpload.upload());
   }

    public static Result upload() throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        List<S3File> uploads = Auth.currentUser().getList();
        String s3Bucket = S3Plugin.application.configuration().getString(AWS_S3_BUCKET);
        UUID id = UUID.randomUUID();
        String accessKey = application.configuration().getString(AWS_ACCESS_KEY);
        String secretKey = application.configuration().getString(AWS_SECRET_KEY);
        String acl = "public-read";
        String success_action_redirect = "localhost:9000/uplode";

        String policy_document = "all files";
        String policy = DatatypeConverter.printBase64Binary(policy_document.getBytes("UTF-8")).replaceAll("\n","").replaceAll("\r","");
        Mac hmac = Mac.getInstance("HmacSHA1");
        hmac.init(new SecretKeySpec(secretKey.getBytes("UTF-8"), "HmacSHA1"));
        String signature = DatatypeConverter.printBase64Binary(hmac.doFinal(policy.getBytes("UTF-8"))).replaceAll("\n", "").replaceAll("\r","");

        return ok(views.html.upload.index.render(s3Bucket,id.toString(),accessKey,acl,success_action_redirect,policy.toString(),signature.toString()));
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
