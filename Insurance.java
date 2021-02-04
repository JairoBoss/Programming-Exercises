package Problemas;
import java.util.Scanner;
public class Insurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Año de nacimiento");
        int nacimiento = sc.nextInt();

        System.out.println("Año actual");
        int actual = sc.nextInt();
        System.out.println("El clienta pagara : "pago(nacimiento,actual));
    }

    public static int pago(int x, int y){
        int edad = y-x;
        int decada = (int) (edad/10);
        return (decada + 15) * 20;
    }


}
