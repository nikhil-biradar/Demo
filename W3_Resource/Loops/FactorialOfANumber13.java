package W3_Resource.Loops;

import java.util.Scanner;

public class FactorialOfANumber13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int fact = 1;

        for(int i=2; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial of a Number is : " + fact);
    }
}