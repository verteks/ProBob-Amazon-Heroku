package models;

import controllers.Auth;
import play.data.validation.Constraints.*;
import scala.reflect.internal.Trees;

/**
 * Данный класс необходим для обработки формы смены пароля.
 * Используется для валидации двух типов.
 *
 * 1. В качестве валидации отдельных полей используются аннотации
 * @Required - обязательное поле.
 *
 * Для задания осмысленного сообщения при наарушении данного ограничения,
 * используется параметр message.
 * @Email(message = "Некорректный адрес электронной почты")
 *
 *
 * 2. Валидация на уровне формы с помощью метода String validate()
 * Когда нет возможности ограничиться валидацией полей по отдельности,
 * например когда условие валидации зависит от соответствия значений нескольких полей,
 *
 * Валидация формы смены пароля проходит тогда, когда старый пароль соответствует текущему пользователю
 *
 * Подсказка: Воспользуйтесь методами Auth.currentUserEmail и Auth.currentUser для получения текущего пользователя и его email
 *
 */
public class ChangePassword{
    @Required
    public String password;

    //todo обязательное поле с подписью
    @Required(message = "Введите новый пароль")
    public String newPassword;


    /**
     * Производит валидацию формы.
     *
     * Подсказка: Воспользуйтесь методами Auth.currentUserEmail и Auth.currentUser для получения текущего пользователя и его email
     *
     * @return null в случае, если валидация успешна. Строку с ошибкой в противном случае.
     */
    public String validate() {

            if (Auth.currentUser().authenticate(Auth.currentUserEmail(),password) == null){
                return null;
            }else{
                return "Не верный пароль";
            }
        }
}

