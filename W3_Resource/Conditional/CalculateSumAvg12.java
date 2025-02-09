package W3_Resource.Conditional;

import java.util.Scanner;

public class CalculateSumAvg12 {
    public static void main(String[] args) {
        System.out.println("Input the 5 Numbers : ");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0;

        for(int i=0; i<5; i++){
            int num = sc.nextInt();
            sum += num;
        }
        avg = sum / 5;
        System.out.println("The Sum of 5 Numbers is : " + sum+ "\n The Average is : " + avg);
    }
}
