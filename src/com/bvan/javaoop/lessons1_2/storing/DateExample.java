package com.bvan.javaoop.lessons1_2.storing;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class DateExample { // LocalDate is an immutable object

    public static void main(String[] args) {
        LocalDate elvisBirthDate = LocalDate.of(1935, 1, 8);
        DayOfWeek dayOfWeek = elvisBirthDate.getDayOfWeek();
        int dayOfWeekValue = dayOfWeek.getValue();
        System.out.println(dayOfWeekValue);

        System.out.println(elvisBirthDate.minusYears(200).getDayOfWeek());

        System.out.println(elvisBirthDate);
    }
}
