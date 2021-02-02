import java.util.Scanner;
public class MetricConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        Pulgadas(valor);
        Galon(valor);
    }

    public static void Pulgadas(int x){
        double centimetros = x / 2.54;
        System.out.println("Dividmos " + x + " pulgadas entre 2.54 y obtenemos " + centimetros + " cm.");
    }

    public static void Galon(int x){
        double litros = x / 3.7854;
        System.out.println("Dividimos " + x + " galones entre 4.7854 y obtenemos " + litros + " litros.");
    }
}
