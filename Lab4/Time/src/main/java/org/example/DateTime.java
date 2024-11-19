package org.example;

import java.util.Scanner;
import java.time.LocalDateTime;

public class DateTime {

    private int year, month, day, hour, minute, second;

    public DateTime() {
        LocalDateTime current = LocalDateTime.now();  // Get current date and time
        this.year = current.getYear();
        this.month = current.getMonthValue();
        this.day = current.getDayOfMonth();
        this.hour = current.getHour();
        this.minute = current.getMinute();
        this.second = current.getSecond();
    }

    public DateTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public DateTime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void displayDateTime() {
        System.out.printf("Date: %04d-%02d-%02d\n", year, month, day);
        System.out.printf("Time: %02d:%02d:%02d\n", hour, minute, second);
    }

    public static void main(String[] args) {
        DateTime defaultDateTime = new DateTime();
        System.out.println("Default constructor (current date and time):");
        defaultDateTime.displayDateTime();

        DateTime customDate = new DateTime(2023, 10, 19);
        System.out.println("\nOverloaded constructor (YEAR, MONTH, DAY):");
        customDate.displayDateTime();

        DateTime customDateTime = new DateTime(2024, 5, 20, 14, 30, 15);
        System.out.println("\nOverloaded constructor (YEAR, MONTH, DAY, HOUR, MINUTES, SECONDS):");
        customDateTime.displayDateTime();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nUpdate date and time using set methods:");

        System.out.print("Enter new year: ");
        int year = scanner.nextInt();
        customDateTime.setYear(year);

        System.out.print("Enter new month: ");
        int month = scanner.nextInt();
        customDateTime.setMonth(month);

        System.out.print("Enter new day: ");
        int day = scanner.nextInt();
        customDateTime.setDay(day);

        System.out.print("Enter new hour: ");
        int hour = scanner.nextInt();
        customDateTime.setHour(hour);

        System.out.print("Enter new minute: ");
        int minute = scanner.nextInt();
        customDateTime.setMinute(minute);

        System.out.print("Enter new second: ");
        int second = scanner.nextInt();
        customDateTime.setSecond(second);

        System.out.println("\nUpdated date and time:");
        customDateTime.displayDateTime();
    }
}
