package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.Routes;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import plugins.S3Plugin;

import static play.libs.Json.toJson;


/**
 * Created by vshir on 18.05.2017.
 */
public class AmazonUpload extends Controller{
   public static Result index() {
       return redirect(routes.AmazonUpload.upload());
   }

    public static Result upload() {
        return ok(
                views.html.upload.index.render());
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
