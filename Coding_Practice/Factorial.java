package Coding_Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        long fact = 1;

        for(int i=1; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial of a Number is : " + fact);
    }
}