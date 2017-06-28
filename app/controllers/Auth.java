package controllers;

import models.BobUser;
import models.EasySearch;
import models.Login;
import models.Register;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Auth extends Controller {
    public static Result login() {
        if (session("email") != null){
            return  redirect(controllers.routes.Application.index());
        }else{
            Form<EasySearch> easySearchForm = Form.form(EasySearch.class);
            Form<Login> loginForm = Form.form(Login.class);
            return ok(login.render(loginForm,easySearchForm));
        }
    }

    public static Result auth() {
        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
        Form<EasySearch> easySearchForm = Form.form(EasySearch.class);

        if (loginForm.hasErrors())
            //форма содержит ошибку и будет выдана пользователю обратно. При ошибки валидации покажутся автоматически засчет form-helper-ов
            return badRequest(login.render(loginForm,easySearchForm));
        else {
            //Установка ключа email в сессии равной email аутентифицированного пользователя.
            session("email", loginForm.get().email);
            //При успехе можем установить во flash значение строки успеха, которое будет отображено в интерфейсе с помощью alert
            flash("success","Вы успешно аутентифицировались. Добро пожаловать!");
            //в случае успеха переходим на главную страницу
            return redirect(controllers.routes.Application.index());
        }
    }
    public static Result logout() {
        session().clear();
        return redirect(controllers.routes.Application.index());
    }
    public static Result signup() {

        if (session("email") != null){
            return  redirect(controllers.routes.Application.index());
        }else{
            Form<Register> registerForm = Form.form(Register.class);
             return ok(register.render(registerForm));
        }
    }
    public static Result register() {
        Form<Register> registerForm = Form.form(Register.class).bindFromRequest();
        if (registerForm.hasErrors()){
            flash("error","Ошибка регистрации");
            return badRequest(register.render(registerForm));
        }else{
            Register user = registerForm.get();
            BobUser us = new BobUser(user.email,user.password);
            us.setEasyAccessHash(user.easyAccess);
            us.save();
            //Установка ключа email в сессии равной email аутентифицированного пользователя.
            session("email", user.email);
            //При успехе можем установить во flash значение строки успеха, которое будет отображено в интерфейсе с помощью alert
            flash("success","Вы успешно аутентифицировались. Добро пожаловать!");
            //в случае успеха переходим на главную страницу
            return redirect(controllers.routes.Application.index());
        }
    }

    public static String currentUserEmail() {
        return session("email");
    }

    public static BobUser currentUser(){
        return BobUser.find.byId(currentUserEmail());
    }
}
