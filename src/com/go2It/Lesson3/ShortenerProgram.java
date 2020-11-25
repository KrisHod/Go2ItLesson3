package com.go2It.Lesson3;

public class ShortenerProgram {

    public static void createShortener(String name, String surname) {
        System.out.println(surname + ", " + name.charAt(0) + ".");
    }

    public static void createShortener(String name) {
        System.out.println(name + ", Esq.");
    }

    public static void main(String[] args) {
        int lengthOfArrayArgs = args.length;

        if (lengthOfArrayArgs==1) {
            createShortener(args[0]);
        } else {
            createShortener(args[0], args[1]);
        }
    }
}
