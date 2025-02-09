package W3_Resource.Conditional;

import java.util.Scanner;

public class DisplaySum11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;

        System.out.println("First " + num +" Natural Numbers are : ");
        for(int i=1; i<=num; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of first " + num  + " Natural Numbers are : ");
        System.out.println(num + " " + sum);
    }
}
