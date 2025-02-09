package W3_Resource.Basics;

import java.util.Scanner;

public class DisplayMultiplication5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Input Secod Number : ");
        int num2 = sc.nextInt();
        System.out.println(num1 + " X " + num2 + " = " + num1 * num2);
    }
}
