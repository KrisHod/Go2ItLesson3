package com.go2It.Lesson3;

import java.util.Scanner;

public class TemperatureConvertor {
    public static String convertTemperatureFromCToF(double temp) {
        double res = temp * 1.8 + 32;
        double roundedRes = Math.round(res * 10) / 10.0;
        String result = temp + "F equals to " + roundedRes + "C.";
        return result;
    }

    public static String convertTemperatureFromFToC(double temp) {
        double res = (temp - 32) / 1.8;
        double roundedRes = Math.round(res * 10) / 10.0;
        String result = temp + "C equals to " + roundedRes + "F.";
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the target temperature");
        int temp = in.nextInt();
        System.out.println("Please enter the target scale (F or C)");
        String scale = in.next();
        if (scale.equalsIgnoreCase("F")) {
            System.out.println(convertTemperatureFromCToF(temp));
        } else if (scale.equalsIgnoreCase("C")) {
            System.out.println(convertTemperatureFromFToC(temp));
        } else {
            System.out.println("Invalid input");
        }
    }
}
