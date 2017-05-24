package controllers;

import models.S3File;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;
import util.Secured;
import views.html.index;

import java.util.List;

@Security.Authenticated(Secured.class)
public class Application extends Controller {

    public static Result index1() {
        return redirect(routes.Auth.login());
    }
    public static Result index() {
        List<S3File> uploads = Auth.currentUser().getList();
        return ok(index.render(uploads));
    }
    public static Result upload() {
        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart uploadFilePart = body.getFile("upload");
        if (uploadFilePart != null) {
            S3File s3File = new S3File();
            s3File.setName(uploadFilePart.getFilename());
            s3File.setFile(uploadFilePart.getFile());
            s3File.setUser(Auth.currentUser());
            s3File.setEasyAccessFile(true);

            s3File.save();
            return redirect(routes.Application.index());
        }
        else {
            return badRequest("File upload error");
        }
    }

}