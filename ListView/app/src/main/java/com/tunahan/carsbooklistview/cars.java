package com.tunahan.carsbooklistview;

import java.io.Serializable;

public class cars implements Serializable {
    String name;
    String country;
    int image;

    public cars(String name,String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }
}
