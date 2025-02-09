package Coding_Practice;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int temp = 0, a = 10, b = 20;
        System.out.println("Before Swapping : " + a + " " + b);

        //1) With using third variable

//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After Swapping : " + a + " " + b);

        //2) Without using third variable
//
//        a = a + b; //10+20=30
//        b = a - b; //30-20=10;
//        a = a - b; //30-10=20
//        System.out.println("After Swapping : " + a + " " + b);

        //3) Using Multiplication and Division

        a = a * b; //10*20=200
        b = a / b; //200/20=10
        a = a / b; //200/10=20
        System.out.println("After Swapping : " + a + " " + b);
        
        //4) By using XOR Gate

//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//        System.out.println("After Swapping : " + a + " " + b);
    }
}
