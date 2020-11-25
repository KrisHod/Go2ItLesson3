package com.go2It.Lesson3;

import java.util.Arrays;
import java.util.List;

public class Task3_2_4 {

    public static void showLeftDays(DAY_OF_WEEK currentDay) {
        if (currentDay.ordinal()==5 || currentDay.ordinal()==6) {
            System.out.println("Horray! It's weekend!");
        } else {
            System.out.println("There are " + (4 - currentDay.ordinal()) + " days till the weekend");
        }
    }

    public static List<DAY_OF_WEEK> returnArray (DAY_OF_WEEK currentDay){
        DAY_OF_WEEK[] arrOfAllDays = DAY_OF_WEEK.values();
        List<DAY_OF_WEEK> daysOfWeekList = Arrays.asList(arrOfAllDays);
        List<DAY_OF_WEEK> daysLeftList = daysOfWeekList.subList(currentDay.ordinal()+1, DAY_OF_WEEK.SATURDAY.ordinal());
        return daysLeftList;
    }

    // overloaded method showLeftDays
    public static void showLeftDays(DAY_OF_WEEK currentDay, int additionalDaysOf){
        if (currentDay.ordinal()==5 || currentDay.ordinal()==6) {
            System.out.println("Horray! It's weekend!");
        } else {
            System.out.println("There are " + (4 - additionalDaysOf - currentDay.ordinal()) + " days till the weekend");
        }
    }



    public static void main(String[] args) {
        showLeftDays(DAY_OF_WEEK.MONDAY);
        System.out.println(returnArray(DAY_OF_WEEK.MONDAY));
        showLeftDays(DAY_OF_WEEK.MONDAY, 3);
    }

}
