package com.ishrivasayush.Practice.Patterns;

import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The value n: ");
        int n=scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
