package com.ishrivasayush.Practice.Patterns;
import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Value Of n.");
        int n=scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++)
            {
                if (j==0 || i==n-1 || i==0)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
