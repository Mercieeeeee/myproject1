package com.Mercieeeeee.post;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        float length = 0;
        float width = 0;
        float height = 0;
        Box3 box3 = new Box3(length, width, height);
        Box5 box5 = new Box5(length, width, height);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length: ");
        float side1 = scanner.nextFloat();
        System.out.println("Please enter object's width: ");
        float side2 = scanner.nextFloat();
        System.out.println("Please enter object's height: ");
        float side3 = scanner.nextFloat();
        if (side1>=side2 && side1>=side3) {
            length = side1;
            if (side2>=side3) {
                width = side2;
                height = side3;
            } else {
                width = side3;
                height = side2;
            }
        } else if (side1<side2 && side1>side3) {
            length = side2;
            width = side1;
            height = side3;
        } else if (side1>side2 && side1<side3) {
            length = side3;
            width = side1;
            height = side2;
        } else if (side1<side2 && side1<side3) {
            height =side1;
            if (side2>=side3) {
                length = side2;
                width = side3;
            } else {
                length = side3;
                width = side2;
            }
        }
        if (box3.validate(length, width, height)) {
            System.out.println("Box3");
        } else if (box5.validate(length, width, height)){
            System.out.println("Box5");
        } else {
            System.out.println("Object is over size");
        }
    }
}
