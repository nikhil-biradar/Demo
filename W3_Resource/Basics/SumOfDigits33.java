package W3_Resource.Basics;

import java.util.Scanner;

public class SumOfDigits33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;

        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum Of Digits : " + sum);
    }
}
