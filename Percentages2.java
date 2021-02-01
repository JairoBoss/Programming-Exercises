import java.util.Scanner;
public class Percentages2 {
    public static void main(String[] args) {
        Scanner sc = Scanner(System.in);
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        computePercent(x,y);
        computePercent(y,x);

    }

    public static void computePercent(double x, double y){
//        double porcentaje = x / y * 100;
        System.out.println(x + " es el " + x / y * 100 + "% de " + y);
    }
}
