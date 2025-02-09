package W3_Resource.Loops;

import java.util.Scanner;

public class ReverseANumber15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;

        while(temp > 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reversed Number : " + rev);
    }
}
