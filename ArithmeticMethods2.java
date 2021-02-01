import java.util.Scanner;
public class ArithmeticMethods2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

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
