package controllers;

import models.S3File;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.index;

import java.util.List;

//@Security.Authenticated(Secured.class)
public class Application extends Controller {

    public static Result index() {
        return redirect(routes.Auth.login());
    }
    public static Result index1() {
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
            s3File.save();
            return redirect(routes.Application.index1());
        }
        else {
            return badRequest("File upload error");
        }
    }

}