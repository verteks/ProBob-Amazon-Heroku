package controllers;

import models.ChangePassword;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import util.Secured;
import views.html.profile;

/**
 * Закрытая часть сайта
 */
@Security.Authenticated(Secured.class)
public class Admin extends Controller {

    /**
     * Возвращает страницу профиля с формой смены пароля.
     *
     * Используются стандартные средства Form[ChangePassword.class] и шаблон profile.scala.html
     *
     * @return страницу профиля с формой смены пароля
     */
    public static Result profile() {
        Form<ChangePassword> cPForm = Form.form(ChangePassword.class);
        return ok(profile.render(cPForm));
    }

    /**
     * Обработка формы смены пароля.
     *
     * Валидация проводится стандартными средствами
     * @see ChangePassword#validate()
     * Валидация проверяет соответствие текущего пароля с залогиненным текущим пользователем.
     * Обращаем ваше внимание, что email в форме отсутствует для безопасности и должен браться из сессии.
     *
     * В случае успеха валидации производится изменение пароля пользователя с помощью метода
     * @see User#setPassword(String)
     *
     * @return Страницу профиля. В случае успешной смены пароля выводится success-сообщение. В случае ошибки валидации формы, сообщение об ошибке.
     *
     * Подсказка: Задать success-сообщение можно с помощью
     * flash("success", "Пароль успешно изменен");
     */
    public static Result changePassword() {
        Form<ChangePassword> cPForm = Form.form(ChangePassword.class).bindFromRequest();
        if (cPForm.hasErrors())
            //форма содержит ошибку и будет выдана пользователю обратно. При ошибки валидации покажутся автоматически засчет form-helper-ов
            return badRequest(profile.render(cPForm));
        else {
            User kk = Auth.currentUser();
            kk.setPassword(cPForm.get().newPassword);
            kk.save();
            flash("success", "Пароль успешно изменен");
            Form<ChangePassword> cPForm2 = Form.form(ChangePassword.class);
            return ok(profile.render(cPForm2));
        }
    }
}