package W3_Resource.Conditional;

import java.util.Scanner;

public class DisplayFloat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        float num = sc.nextFloat();

        if (num == 0)
            System.out.println("Number is Zero");
        else if(num > 1000000)
            System.out.println("Number is Large");
        else if (num > 0 && num < 1)
            System.out.println("Number is Small");
        else if (num > 0 && num <1000000)
            System.out.println("Number is Positive");
        else if (num < 1)
            System.out.println("Number is Negative");
    }
}
