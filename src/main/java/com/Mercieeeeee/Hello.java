package com.Mercieeeeee;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        String s = new String("abcde");
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1, 4));
//        String s1 = null;
//        System.out.println(s1.charAt(3));
        Person p = new Person("Mercieeeeee",66.5f, 1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80 || score > 90);
        char c = 'A';
        System.out.println(c > 'a');
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n > 60);

        /*int age = 19;
        Integer age2 = 19;
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float wetght = 66.5f;
//        Float;
        double heught = 1.7;
//        Double;
        boolean adult = true;
        boolean enroll = false;
//        Boolean;
        String name = "Mercieeeeee";*/
    }
}
