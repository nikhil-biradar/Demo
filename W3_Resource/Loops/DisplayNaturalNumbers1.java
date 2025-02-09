package W3_Resource.Loops;

import java.util.Scanner;

public class DisplayNaturalNumbers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Starting Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Ending Number : ");
        int num2 = sc.nextInt();

        while(num1 <= num2){
            System.out.println(num1);
            num1++;
        }
    }
}
