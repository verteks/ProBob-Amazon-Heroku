package controllers;

import models.S3File;
import models.User;
import play.data.validation.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.util.List;

public class EasyAccess extends Controller {

    public static Result search(@Required String easyAccessSearch) {
        //String easyAccessSearch = request().body().asJson().findPath("easySearch").asText();
        User us = User.find.where().like("easyAccessHash",User.getEasyAccessHash(easyAccessSearch)).findUnique();
        List<S3File> uploads = us.getEasyAccessList();
        return ok(index.render(uploads));
    }
}

