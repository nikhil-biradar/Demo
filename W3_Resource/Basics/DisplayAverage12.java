package W3_Resource.Basics;

import java.util.Scanner;

public class DisplayAverage12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Number 3 : ");
        int num3 = sc.nextInt();

        int average = ((num1 + num2 + num3) / 3);
        System.out.println(average);
    }
}