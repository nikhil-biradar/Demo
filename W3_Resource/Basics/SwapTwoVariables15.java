package W3_Resource.Basics;

public class SwapTwoVariables15 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        int temp;

        //Method 1 :
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println();

        int num3 = 10;
        int num4 = 20;

        //Method 2 :
        num3 = num3 + num4; // 5 + 6 = 11
        num4 = num3 - num4; // 11 - 6 = 5
        num3 = num3 - num4; // 11 - 5 = 6
        System.out.println(num3);
        System.out.println(num4);

    }
}
