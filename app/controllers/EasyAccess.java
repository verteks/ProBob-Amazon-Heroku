package controllers;

import models.S3File;
import models.User;
import play.Logger;
import play.data.DynamicForm;
import play.data.validation.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.util.List;
import java.util.Map;

public class EasyAccess extends Controller {

    public static Result search() {
        Map<String, String[]> params = request().body().asFormUrlEncoded();
//        String easyAccessSearch =  params.get("easyAccessHash")[0];
        String easyAccessSearch = "";
        Logger.info(String.valueOf(params.size()));
        //DynamicForm
        //String easyAccessSearch = request().body().asJson().findPath("easySearch").asText();
        User us = User.find.where().like("easyAccessHash",User.getEasyAccessHash(easyAccessSearch)).findUnique();
        List<S3File> uploads = us.getEasyAccessList();
        return ok(index.render(uploads));
    }
}

