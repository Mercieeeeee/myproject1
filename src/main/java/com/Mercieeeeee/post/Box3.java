package com.Mercieeeeee.post;

public class Box3 {
    float length;
    float width;
    float height;

    public Box3(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, float height) {
        if (length <= 23 && width <= 14 && height <= 13) {
            return true;
        } else {
            return false;
        }
    }
}
