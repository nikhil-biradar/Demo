package W3_Resource.Conditional;

import java.util.Scanner;

public class CheckNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
    }
}

