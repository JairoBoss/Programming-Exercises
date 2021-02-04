package Problemas;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la tarifa de pago por hora, horas regulares y horas extra.");
        int tariafaXH = sc.nextInt();
        int horasRegulares = sc.nextInt();
        int horasExtras = sc.nextInt();
        System.out.println("El pago de horas extras es de: " + horasExtras(tariafaXH, horasRegulares,horasExtras));
    }

    public static double horasExtras(int tarifa, int horasR, int horasE){
        return horasR * tarifa +((tarifa * 1.5 )*horasE);
    }
}
