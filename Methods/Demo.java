package Methods;

class Computer{
    public void PlayMusic(){
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost){
        if(cost >= 10) {
            return "Pen";
        }else{
            return "Nothing";
        }
    }
}

class Addition{
    public int add(int n1, int n2, int n3){
        return  n1 + n2 + n3;
    }
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public double add(double n1, int n2){
        return n1 + n2;
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.PlayMusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);

        Addition obj1 = new Addition();
        int result = obj1.add(10, 20, 30);
        System.out.println(result);

        int result1 = obj1.add(10, 20);
        System.out.println(result1);

        double result2 = obj1.add(20.0, 20);
        System.out.println(result2);
    }
}