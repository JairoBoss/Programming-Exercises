public class ArithmeticMethods {
    public static void main(String[] args) {
        int x = 10;
        int y = 11;

        displayNumberPlus10(x);
        displayNumberPlus100(x);
        displayNumberPlus1000(x);

    }

    public static void displayNumberPlus10(int x){
        System.out.println(x + " + 10 = " + (x+10));
    }

    public static void displayNumberPlus100(int x){
        System.out.println(x + " + 100 = " + (x+100));
    }

    public static void displayNumberPlus1000(int x){
        System.out.println(x + " + 1000 = " + (x+1000));
    }


}
