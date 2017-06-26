package models;

import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import play.Logger;
import play.db.ebean.Model;
import plugins.S3Plugin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.UUID;

@Entity
public class S3File extends Model {

    @Id
    private UUID id;

    private String bucket;

    @ManyToOne
    private User user;
    private String name;
    private boolean easyAccessFile;
    private SimpleDateFormat date;

    @Transient
    private File file;

    public UUID getId() {return id;}
    public String getName() {return name;}
    public File getFile() {return file;}
    public User getUser() {return user;}
    public String getBucket() {return bucket;}
    public SimpleDateFormat getDate(){return date;
    }
    public boolean isEasyAccessFile() {
        return easyAccessFile;
    }


    public static Finder<UUID, S3File> find = new Finder<UUID, S3File>(UUID.class, S3File.class);

    public void setName(String name) {this.name = name;}
    public void setBucket(String bucket) {this.bucket = bucket;}
    public void setFile(File file) {this.file = file;}
    public void setUser(User user) {this.user = user;}

    public void setEasyAccessFile(boolean easyAccessFile) {
        this.easyAccessFile = easyAccessFile;
    }

    public URL getUrl() throws MalformedURLException {
        return new URL("https://s3.amazonaws.com/" + bucket + "/" + getActualFileName());
    }

    private String getActualFileName() {
        return id + "/" + name;
    }
    public void superSave() {
        super.save();
    }

    public void setDate(SimpleDateFormat date) {
        this.date = date;
    }

    @Override
    public void save() {
        if (S3Plugin.amazonS3 == null) {
            Logger.error("Could not save because amazonS3 was null");
            throw new RuntimeException("Could not save");
        }
        else {
            this.bucket = S3Plugin.s3Bucket;
            
            super.save(); // assigns an id

            PutObjectRequest putObjectRequest = new PutObjectRequest(bucket, getActualFileName(), file);
            putObjectRequest.withCannedAcl(CannedAccessControlList.PublicRead); // public for all
            S3Plugin.amazonS3.putObject(putObjectRequest); // upload file
        }
    }

    @Override
    public void delete() {
        if (S3Plugin.amazonS3 == null) {
            Logger.error("Could not delete because amazonS3 was null");
            throw new RuntimeException("Could not delete");
        }
        else {
            S3Plugin.amazonS3.deleteObject(bucket, getActualFileName());
            super.delete();
        }
    }

}
