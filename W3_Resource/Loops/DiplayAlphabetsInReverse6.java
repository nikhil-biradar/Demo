package W3_Resource.Loops;

public class DiplayAlphabetsInReverse6 {
    public static void main(String[] args) {
        //Using While Loop
        char c = 'Z';
        while(c >= 'A'){
            System.out.print(c + " ");
            c--;
        }

        //Using For Loop
        System.out.println();
        for(char i='z'; i>='a'; i--){
            System.out.print(i + " ");
        }
    }
}
