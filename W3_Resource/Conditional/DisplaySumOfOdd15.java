package W3_Resource.Conditional;

import java.util.Scanner;

public class DisplaySumOfOdd15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;

        System.out.println("The Odd Numbers are : ");
        for(int i=1; i<=num; i++){
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }
        System.out.println("The Sum of Odd Natural Number upto " + num + " terms is : " + sum);
    }
}
