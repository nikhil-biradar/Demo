package W3_Resource.Conditional;

import java.util.Scanner;

public class DisplayCube13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input Number : ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i*i*i));
        }
    }
}
