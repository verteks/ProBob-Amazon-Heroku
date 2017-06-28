package models;

import play.data.validation.Constraints.Required;


public class EasySearch {
    @Required
    public String easyAccess;

    public String validate() {
            if ( BobUser.vailableEasy(easyAccess)){
                return "it is no easy? try again or do registration and create you own easy access";
            }else{
                return null;
            }


    }
}
