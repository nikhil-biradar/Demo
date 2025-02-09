package W3_Resource.Conditional;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = sc.nextInt();

        if((year % 4 == 0) || ((year % 400 == 0) || (year % 100 == 0))){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
