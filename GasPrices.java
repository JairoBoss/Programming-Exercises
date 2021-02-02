import java.util.Scanner;
public class GasPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int precio = sc.nextInt();

        pricePerBarrel(precio);
    }

    public static void pricePerBarrel(int x){
        double precio1 = (x * 3.5) / 100;
        double precio2 = (x * 4 ) / 100;

        System.out.println("El precio esta entre: $" + precio1 + " y $" + precio2 + ".");
    }
}
