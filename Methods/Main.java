package Methods;

public class Main {
    public static void main(String[] args) {
        Additions obj = new Additions();
        int result = obj.add(10, 20);
        int result1 = obj.add(10, 20, 30);
        double result2 = obj.add(70.0, 20);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

        Animal obj1 = new Animal();
        String Bark = obj1.Bark();
        System.out.println(Bark);

        Cow obj2 = new Cow();
        String Moo = obj2.Moo();
        System.out.println(Moo);
    }
}

class Additions{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1, int n2){
        return n1 + n2;
    }
}

class Animal{
     String Bark(){
        return "Bho-Bho";
    }
}

class Cow{
    String Moo(){
        return "Hum-Hum";
    }
}

