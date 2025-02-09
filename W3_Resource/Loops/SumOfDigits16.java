package W3_Resource.Loops;

import java.util.Scanner;

public class SumOfDigits16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;

        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of its Digits : " + sum);
    }
}
