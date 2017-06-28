package models;

import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Required;


public class Register{
    @Email(message = "Некорректный адрес электронной почты")
    @Required(message = "Введите email")
    public String email;

    //todo обязательное поле с подписью
    @Required(message = "Введите пароль")
    public String password;

    @Required
    public String easyAccess;

    public String validate() {
        if (easyAccess != ""){
            if ( ! BobUser.vailableEasy(easyAccess)){
                return "too easy to be available, so please enter another easy access link";
            }

        }
        if (BobUser.vailable(email)){
            return null;
            //return easyAccess+BobUser.vailableEasy(easyAccess);
        }else{
            return "такой email занят";

            //return easyAccess+BobUser.vailableEasy(easyAccess);
        }
    }
}
