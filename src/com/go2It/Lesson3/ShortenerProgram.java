package com.go2It.Lesson3;

public class ShortenerProgram {

    public static String createShortener(String name, String surname) {
        String res = surname + ", " + name.charAt(0) + ".";
        return res;
    }

    public static String createShortener(String name) {
        String res = name + ", Esq.";
        return res;
    }

    public static void main(String[] args) {
        int lengthOfArrayArgs = args.length;

        if (lengthOfArrayArgs==1) {
            System.out.println(createShortener(args[0]));
        } else {
            System.out.println(createShortener(args[0], args[1]));
        }
    }
}
