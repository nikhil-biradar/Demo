package W3_Resource.Arrays;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to Store : ");
        int num = sc.nextInt();
        int arr[] = new int [num];
        System.out.print("Enter the elements of Array : ");
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println("Elements of Array are : ");
        for(int i=0; i<num; i++){
            System.out.print(arr[i] + " ");
        }
    }
}