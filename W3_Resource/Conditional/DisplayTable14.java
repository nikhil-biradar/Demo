package W3_Resource.Conditional;

import java.util.Scanner;

public class DisplayTable14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
