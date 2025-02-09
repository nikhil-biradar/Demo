package exception.handling;

public class TryCatchFinally {
    public static void main(String[] args) {

        try{
            System.out.println("Hello");
            System.out.println(10/0);
            System.out.println("Hello1");

        }catch(Exception e){
            System.out.println("Hello2");
            System.out.println("Number cannot divided by zero");
            System.out.println("Hello3");

        }finally {
            System.out.println("Finally Block");
        }
    }
}
