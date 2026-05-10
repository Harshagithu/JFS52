package com.codegnan.data;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // 1. Get current date
        LocalDate today = LocalDate.now();

        // 2. Print tomorrow's date using plusDays(1)
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow's Date: " + tomorrow);

        // 3. Find current month name using getMonth()
        System.out.println("Current Month: " + today.getMonth());

        // 4. Add 2 hours to current time using LocalTime and plusHours(2)
        LocalTime timePlusTwo = LocalTime.now().plusHours(2);
        System.out.println("Time after 2 hours: " + timePlusTwo);

        // 5. Check whether the year is a leap year using isLeapYear()
        boolean isLeap = today.isLeapYear();
        System.out.println("Is " + today.getYear() + " a leap year? " + isLeap);

        // 6. Print current date in format: dd-MM-yyyy using DateTimeFormatter.ofPattern()
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Current Date: " + formattedDate);
    }
}