package c.ardv.museumapp;

import java.io.Serializable;

/**
 * Created by arov on 16.04.2018.
 */

public class Museum implements Serializable {

    public String title;
    public String photo;
    public  String place;
    public Museum (String title, String photo) {
        this.title = title;
        this.photo = photo;
    }
}
