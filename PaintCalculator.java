package Problemas;
import java.util.Scanner;
public class PaintCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int longitud = sc.nextInt();
        int ancho = sc.nextInt();
        int altura = sc.nextInt();
    }

    public static int area(int x,int y, int z){
        return ((x+y)+(y*z)*2);
    }

    public static void calcularBotes(int x,int y,int z){
        double botes = area(x,y,z) / 350;
        double precio = botes * 32;

        System.out.println("El costo por pintar la habitacion es de: " + precio + " y utilizaras: " + botes + " botes.");
    }
}
