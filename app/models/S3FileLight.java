package models;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.UUID;


public class S3FileLight {
    public UUID id;
    public URL url;
    public String name;
    public boolean easyAccessFile;
    public SimpleDateFormat date ;

    public S3FileLight(UUID id, URL url, String name, boolean easyAccessFile, SimpleDateFormat date) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.easyAccessFile=easyAccessFile;
        this.date = date;
    }
}
