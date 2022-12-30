package com.ishrivasayush.Practice;
import java.util.Scanner;
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Value of Start...");
        int start=scanner.nextInt();
        System.out.println("Enter the Value of End...");
        int end=scanner.nextInt();
        for (int i = start; i <end ; i++) {
            if (isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int i)
    {
        for (int j = 2; j*j<=i ; j++) {
            if (i%j==0)
            {
                return false;
            }
        }
        return true;
    }
}
