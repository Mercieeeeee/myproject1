package com.Mercieeeeee;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person("Mercieeeeee",66.5f, 1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());

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
