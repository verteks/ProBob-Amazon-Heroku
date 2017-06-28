package controllers;

import models.BobUser;
import models.S3File;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.easyAccessList;
import views.html.easyError;
import views.html.err;

import java.util.List;

import static play.data.Form.form;

public class EasyAccess extends Controller {

    public static Result search() {

        List<S3File> uploads = null;
        String easyAccessSearch = form().bindFromRequest().get("easySearch");
         if (easyAccessSearch !=null){
             BobUser us = null;
             us = BobUser.find.where().like("easyAccessHash", BobUser.getEasyAccessHash(easyAccessSearch)).findUnique();
             if (us == null) {
             return ok(easyError.render("Wrong easy access string"));
             }
             uploads = null;
             uploads = us.getEasyAccessList();
             if (uploads == null){
                 return ok(easyError.render("Доступные файлы отсутствуют"));
             }
         }else{
             return ok(err.render(request().host()+request().path()));
         }

        return ok(easyAccessList.render(uploads));
    }
}

