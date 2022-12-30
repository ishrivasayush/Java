package com.ishrivasayush.Practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Year: ");
        int year= scanner.nextShort();
        if ((year%4==0 || year%400==0) & (year%100!=0))
        {
            System.out.println(year+" Is The Leap Year.");
        }
        else {
            System.out.println("This Is Not A Leap Year.");
        }
    }
}
