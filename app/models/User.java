package models;

import org.apache.commons.codec.binary.Base64;
import play.api.libs.Crypto;
import play.data.validation.Constraints.Email;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Entity
public class User extends Model {

    /**
     * Email - электронная почта пользователя
     */
    @Id
    private UUID id;
    @Email
    @Column(unique=true)
    private String email;

    @OneToMany(mappedBy = "user")
    private List<S3File> list;

    private String passwordHash;
    private String salt;
    public User(String email, String password) {
        this.email = email;
        setPassword(password);
    }
    public static Finder<String, User> findByEmail = new Finder<String, User>(String.class, User.class);
    public static Finder<UUID, User> findById = new Finder<UUID, User>(UUID.class, User.class);
    public static User findByEmail(String email) {
        return findByEmail.ref(email);
    }
    public static User findById(UUID id) {
        return findById.ref(id);
    }
    public List<S3File> getList() {
        return list;
    }
    public String getEmail() { return email; }
    public UUID getId() { return id; }

    private String getHash(String s) {
        s = SHA256(s);
        return s;
    }

    public void setPassword(String password) {
        salt=genSalt();
        passwordHash=getHash(password+salt);
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
        User us = User.findByEmail(email);
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
        User us = User.findByEmail(email);
        if (us != null){
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
}
