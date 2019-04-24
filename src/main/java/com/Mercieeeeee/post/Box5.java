package com.Mercieeeeee.post;

public class Box5 {
    float length;
    float width;
    float height;

    public Box5(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, float height) {
        if (length <= 39.5 && width <= 27.5 && height <= 23) {
            return true;
        } else {
            return false;
        }
    }
}