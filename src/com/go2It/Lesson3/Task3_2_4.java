package com.go2It.Lesson3;

import java.util.Arrays;
import java.util.List;

public class Task3_2_4 {

    public static void showLeftDays(DAYS_OF_WEEK currentDay) {
        if (currentDay.ordinal()==5 || currentDay.ordinal()==6) {
            System.out.println("Horray! It's weekend!");
        } else {
            System.out.println("There are " + (4 - currentDay.ordinal()) + " days till the weekend");
        }
    }

    public static List<DAYS_OF_WEEK> returnArray (DAYS_OF_WEEK currentDay){
        DAYS_OF_WEEK [] arrOfAllDays = DAYS_OF_WEEK.values();
        List<DAYS_OF_WEEK> daysOfWeekList = Arrays.asList(arrOfAllDays);
        List<DAYS_OF_WEEK> daysLeftList = daysOfWeekList.subList(currentDay.ordinal()+1,DAYS_OF_WEEK.SATURDAY.ordinal());
        return daysLeftList;
    }

    public static void main(String[] args) {
        showLeftDays(DAYS_OF_WEEK.MONDAY);
        System.out.println(returnArray(DAYS_OF_WEEK.MONDAY));
    }

}
