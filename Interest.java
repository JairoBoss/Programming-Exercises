package Problemas;
import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inversion inicial");
        int inversion = sc.nextInt();

    }

    public static double interes(int x){
        return (x + (x*.05));
    }
}
