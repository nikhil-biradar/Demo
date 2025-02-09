package W3_Resource.Basics;

import java.util.Scanner;

public class ReverseString37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        String reversedString = "";

        for(int i=str.length()-1; i>=0; i--){
            reversedString += str.charAt(i);
        }
        System.out.println(reversedString);
    }
}
