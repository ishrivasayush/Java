package com.ishrivasayush.Practice;
import java.util.Scanner;
public class EvenOrOddInRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Value of Start...");
        int start=scanner.nextInt();
        System.out.println("Enter the Value of End...");
        int end=scanner.nextInt();
        for (int i = start; i <end ; i++) {
            if (evenOdd(i))
            {
                System.out.println("The Even Numbers are ....>\n "+i);
            }
            else {
                System.out.println("The Odd Numbers are ....>\n "+i);
            }
        }
    }
    static boolean evenOdd(int i)
    {
        if (i%2==0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
