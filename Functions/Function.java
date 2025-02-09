package Functions;

import java.util.Scanner;

public class Function {
    public static void printMyName(String name){
        System.out.println("Your Name is : " + name);
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter Your Name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
    }
}
