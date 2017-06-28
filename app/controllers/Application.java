package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.S3File;
import models.S3FileLight;
import play.Logger;
import play.Routes;
import play.libs.Json;
import play.mvc.*;
import util.Secured;
import views.html.index;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static play.libs.Json.toJson;

@Security.Authenticated(Secured.class)
public class Application extends Controller {

    public static Result index1() {
        return redirect(routes.Auth.login());
    }
    public static Result index() {
        List<S3File> uploads = Auth.currentUser().getList();
       // List<S3File> uploads = null;
       // return ok(index.render(uploads));
        return ok(index.render());
    }
    public static Result upload() {
        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart uploadFilePart = body.getFile("upload");
        boolean easyAccess = body.asFormUrlEncoded().containsKey("easyAccessFile");

        if (uploadFilePart != null) {
            S3File s3File = new S3File();
            s3File.setName(uploadFilePart.getFilename());
            s3File.setFile(uploadFilePart.getFile());
            s3File.setBobUser(Auth.currentUser());
            s3File.setEasyAccessFile(easyAccess);
            SimpleDateFormat date = new SimpleDateFormat();
            s3File.setDate(date);

            s3File.save();
            return redirect(routes.Application.index());
        }
        else {
            return badRequest("File upload error");
        }
    }
    private static Result errorJsonResult(String errorMessage) {
        return badRequest(errorJson(errorMessage));
    }
    private static JsonNode errorJson(String errorMessage) {
        return Json.newObject().put("error", errorMessage);
    }
    public static Result filesJson() throws MalformedURLException {
        Logger.info("knock knock");
        List<S3File> uploads = Auth.currentUser().getList();
        Logger.info(uploads.toString());
        List<S3FileLight> lightList= new ArrayList<S3FileLight>();
        for (S3File upload:uploads) {
            lightList.add(new S3FileLight(upload.getId(),upload.getUrl(),upload.getName(),upload.isEasyAccessFile(), upload.getDate()));
        }
        Arrays.sort(new List[]{lightList});
         if (uploads != null){
        return ok(toJson(lightList));
         }else{
             return ok(toJson(new ArrayList<S3FileLight>()));
         }
    }
    @BodyParser.Of(BodyParser.Json.class)
    public static Result deleteFileJson() {
        play.Logger.info("deleteNoteJson()");
        JsonNode json = request().body().asJson();

        if (json == null) {
            return errorJsonResult("Json expected");
        } else {
            play.Logger.info(json.findPath("id").asText().toString());
            UUID id = null;
            try {
                    id = UUID.fromString(json.findPath("id").asText());

            } catch (IllegalArgumentException nfe) {
                return errorJsonResult("wrong type id");
            } finally {
//                    if (id == null) {
//                        play.Logger.info(json.findPath("id").asText().toString());
//                        return errorJsonResult("id must be specified");
//                    }
            }
            assert(id!=null);

            S3File file = S3File.find.byId(id);
            play.Logger.debug(file.toString());
            if (file == null) {
                return notFound(errorJson("Wrong file error"));
            }
            if (! file.getBobUser().equals(Auth.currentUser()))
            {
                return errorJsonResult("Wrong file error");
            }
            JsonNode result = Json.toJson(id);
            file.delete();
            return ok(result);
        }
    } @BodyParser.Of(BodyParser.Json.class)
    public static Result changeEasyAccess() {
        play.Logger.info("changeEasyAccess()");
        JsonNode json = request().body().asJson();
        if (json == null) {
            return errorJsonResult("Json expected");
        } else {
            play.Logger.info(json.findPath("id").asText().toString());
            UUID id = null;
            boolean easyAccess;
            try {
                    id = UUID.fromString(json.findPath("id").asText());
                    easyAccess  = json.findPath("easyAccess").asBoolean();

            } catch (IllegalArgumentException nfe) {
                return errorJsonResult("wrong type id");
            } finally {
//                    if (id == null) {
//                        play.Logger.info(json.findPath("id").asText().toString());
//                        return errorJsonResult("id must be specified");
//                    }
            }
            assert(id!=null);

            S3File file = S3File.find.byId(id);
            play.Logger.debug(file.toString());
            if (file == null) {
                return notFound(errorJson("Wrong file error"));
            }
            if (! file.getBobUser().equals(Auth.currentUser()))
            {
                return errorJsonResult("Wrong file error");
            }
            play.Logger.info(String.valueOf(easyAccess));
            JsonNode result = Json.toJson(id);
            file.setEasyAccessFile(easyAccess);
            file.superSave();
            return ok(result);
        }
    }
    public static Result jsRoutes() {
        response().setContentType("text/javascript");
        return ok(
                Routes.javascriptRouter("jsRoutes",
                        controllers.routes.javascript.Application.filesJson(),
                        controllers.routes.javascript.Application.deleteFileJson(),
                        controllers.routes.javascript.Application.changeEasyAccess()
                )
        );
    }
//
//    public static class S3FileLight implements Comparable<S3FileLight> {
//        S3FileLight date;
//
//        public S3FileLight (S3FileLight date) {
//            this.date = date;
//        }
//
//        @Override
//        public String toString() {
//            return String.valueOf(date);
//        }
//
//        @Override
//        public int compareTo(S3FileLight date2) {
//            return date2.date.compareTo(date2.date);
//        }
//    }
}

