package models;

import org.apache.commons.codec.binary.Base64;
import play.api.libs.Crypto;
import play.data.validation.Constraints.Email;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

@Entity
public class User extends Model {

    /**
     * Email - электронная почта пользователя
     */
    @Id
    @Email
    private String email;

    @OneToMany(mappedBy = "user")
    private List<S3File> list;

    private String passwordHash;
    private String salt;
    private String easyAccessHash;
    private String easySalt;


    public User(String email, String password) {
        this.email = email;
        setPassword(password);
    }
    public static Finder<String, User> find = new Finder<String, User>(String.class, User.class);
    public List<S3File> getList() {
        return list;
    }
    public List<S3File> getEasyAccessList() {
        List<S3File> easyList = null;
        for (S3File one:list) {
            if (one.isEasyAccessFile()) {
                easyList.add(one);
            }

        }
        return easyList;
    }
    public String getEmail() { return email; }

    private String getHash(String s) {
        s = SHA256(s);
        return s;
    }
    public static String getEasyAccessHash (String s) {
        s = SHA256(s);
        return s;
    }

    public void setPassword(String password) {
        salt=genSalt();
        passwordHash=getHash(password+salt);
    }
    public void setEasyAccessHash(String easyAccess) {
        //easySalt=genEasySalt();
        easyAccessHash=getEasyAccessHash(easyAccess+"");
    }



    private boolean checkPassword(String password) {
        if (password.isEmpty() ) {
            return !password.isEmpty();
        }else{
            password=getHash(password+salt);
            if (password.equals(passwordHash)){
                return true;
            }else{
                return false;
            }
        }
    }



    public static String authenticate(String email, String password) {
        if (email.isEmpty() || password.isEmpty()){return "Поля не заполнены";}
        User us = User.find.byId(email);
        if (us == null){
            return "Пользователь с данным email не зарегистрирован";
        }else {
            if (us.checkPassword(password)){
            return null;
        }else {
            return "Не верный пароль";
            }
        }
    }

    public static boolean vailable(String email) {
        User us = User.find.byId(email);
        if (us != null){
            return false;
        }else {
            return true;
        }
    }
    public static boolean vailableEasy(String easy){
        List<User> us = User.find.where().like("easyAccessHash",getEasyAccessHash(easy)).findList();
        if (us.size() !=0){
            return false;
        }else {
            return true;
        }
    }

    public static String SHA256(String str) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(str.getBytes());
            return javax.xml.bind.DatatypeConverter.printHexBinary(digest.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String SHA1(String str){
        //Используется класс Crypto из пакета, встроенного в Play
        return Crypto.sign(str);
    }

    public static String genSalt(){
        final Random r = new SecureRandom();
        byte[] salt = new byte[32];
        r.nextBytes(salt);
        return Base64.encodeBase64String(salt);
    }
    public static String genEasySalt(){
        final Random r = new SecureRandom();
        byte[] salt = new byte[32];
        r.nextBytes(salt);
        return Base64.encodeBase64String(salt);
    }
}
