package Coding_Practice;

import java.util.Scanner;

public class FibSer {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number : ");
//        int num = sc.nextInt();
//        int num1 = 0, num2 = 1, sum = 0;
//
//        for(int i=1; i<=num; i++){
//            System.out.print(num1 + " ");
//            sum = num1 + num2;
//            num1 = num2;
//            num2 = sum;

        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(int i=2;i<10;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);

            n1=n2;
            n2=n3;
        }
    }
    }
//}
