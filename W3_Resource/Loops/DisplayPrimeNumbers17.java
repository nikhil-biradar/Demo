package W3_Resource.Loops;

import java.util.Scanner;

public class DisplayPrimeNumbers17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int count = 0;

        for(int i=2; i<=num; i++){
            if(num % i == 0){
                count ++;
                break;
            }
        }
        if(count == 0){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not Prime");
        }
    }
}