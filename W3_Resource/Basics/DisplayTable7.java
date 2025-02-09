package W3_Resource.Basics;

import java.util.Scanner;

public class DisplayTable7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Number : ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
