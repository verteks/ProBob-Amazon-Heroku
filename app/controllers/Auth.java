package controllers;

import models.Login;
import models.Register;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;
import views.html.register;

public class Auth extends Controller {
    public static Result login() {
        if (session("email") != null){
            return  redirect(controllers.routes.Application.index());
        }else{
            Form<Login> loginForm = Form.form(Login.class);
            return ok(login.render(loginForm));
        }
    }

    public static Result auth() {
        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
        if (loginForm.hasErrors())
            //форма содержит ошибку и будет выдана пользователю обратно. При ошибки валидации покажутся автоматически засчет form-helper-ов
            return badRequest(login.render(loginForm));
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
        play.Logger.info("whatttt");
        Form<Register> registerForm = Form.form(Register.class).bindFromRequest();


        if (registerForm.hasErrors()){
            flash("error","Ошибка регистрации");
            return badRequest(register.render(registerForm));
        }else{
            Register user = registerForm.get();
            User us = new User(user.email,user.password);
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

    public static User currentUser(){
        return User.findByEmail(currentUserEmail());
    }
}