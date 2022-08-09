package com.tunahan.carsbook;

import java.io.Serializable;

public class cars implements Serializable {
    String name;
    int image;

    public cars(String name, int image) {
        this.name = name;
        this.image = image;
    }
}
