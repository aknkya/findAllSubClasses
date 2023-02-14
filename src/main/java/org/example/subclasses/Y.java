package org.example.subclasses;

import org.example.X;

public class Y extends X {
    private  String deneme;

    public String getDeneme() {
        return deneme;
    }

    public X setDeneme(String deneme) {
        this.deneme = deneme;
        return this;
    }
}
