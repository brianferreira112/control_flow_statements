package com.teksystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //    int x = 7;
        //   if (x<10) {
        //        System.out.println("Less Than 10");
        //    }

        /*
        int o = 7;
        if (o<10) {
            System.out.println("Less Than 10");
        }
        else {
            System.out.println("Greater than 10");
        }
        */

        /*
        int x = 20;
            if (x<10) {
                System.out.println("Less Than 10");
            }
            else if (x>10 && x<20) {
                System.out.println("Between 10 and 20");
            }
            else
                System.out.println("Greater than or equal to 20");
            */


        /*
        int x = 15;
        if (x<10 || x>20) {
            System.out.println("Out of Range");
            }
        else {
            System.out.println("In range");
            }
            */

        /*
        int score;
        char grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("Number Score:");
        score = sc.nextInt();

        if (score>=90 && score <=100) {
            System.out.println('A');
        }
        else if (score >=80 && score<90) {
            System.out.println('B');
        }
        else if (score>=70 && score <80) {
            System.out.println('C');
        }
        else if (score >=60 && score <70) {
            System.out.println('D');
        }
        else
            System.out.println('F');
        */


        int number;
        String weekday = null;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Integer:");
        number = s.nextInt();

        if (number <1 || number >7)
            System.out.println("Out of Range");
        else
        switch (number) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday ="Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
        }
        System.out.println("Day of the Week is " + weekday);


    }
}
