/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextbookExamples;

/**
 *
 * @author Ben Michalowicz
 */
import java.util.Scanner;

public class PrintCalendar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a full year (i.e. 2012): ");
        int year = sc.nextInt();

        System.out.print("Enter a number for a month, 1 to 12: ");
        int month = sc.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);

        printMonthBody(year, month);

    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("          " + getMonthName(month)
                + " " + year);

        System.out.println("------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        String monthName = "";

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }

        return monthName;
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStart(year, month);

        int daysInMonth = getNumDaysMonth(year, month);

        int i;

        for (i = 0; i < startDay; i++) {
            System.out.print("    ");
    
        }
        
        for(i = 1; i<=daysInMonth; i++){
            System.out.printf("%4d", i);
            
            if((i+startDay)%7==0) {
                System.out.println();
            }
        }
        
        System.out.println();
    }
    
    
    
    
    public static int getStart(int year, int month){
        final int START_FOR_JAN1_1800 = 3;
        
        int totalNumDays = getTotalNumDays(year, month);
        
        
        return (totalNumDays + START_FOR_JAN1_1800)%7;
    }
    
    
    
    public static int getTotalNumDays(int year, int month){
        int total = 0;
        
        
        for(int i = 1800; i<year; i++){
            if(isLeapYear(i)) {
                total+=366;
            } else{
                total+=365;
            }
        }
        
        for(int i = 1; i<month; i++) {
            total += getNumDaysMonth(year, i);
        }
        
        return total;
    }
    
    
    
    public static int getNumDaysMonth(int year, int month){
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            return 31;
        }
        
        if(month==4||month==6||month==9||month==11) {
            return 30;
        }
        
        
        if(month ==2) {
            return (isLeapYear(year)? 29 : 28);
        }
        return 0;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
