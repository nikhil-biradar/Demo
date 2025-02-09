package Coding_Practice.String;

public class ReverseString {
    public static void main(String[] args) {
        String rev = "";
        String str = "Biradar";

        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}