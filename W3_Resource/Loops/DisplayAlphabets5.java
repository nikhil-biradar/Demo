package W3_Resource.Loops;

public class DisplayAlphabets5 {
    public static void main(String[] args) {
        //Using While Loop
        char c = 'A';
        while(c <= 'Z'){
            System.out.print(c + " ");
            c++;
        }

        //Using For Loop
        System.out.println();
        for(char i='a'; i<='z'; i++){
            System.out.print(i + " ");
        }
    }
}
