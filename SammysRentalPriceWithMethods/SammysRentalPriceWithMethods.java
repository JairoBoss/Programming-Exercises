package SammysRentalPriceWithMethods;

import java.util.Scanner;

public class SammysRentalPriceWithMethods {

    Scanner sc = new Scanner(System.in);
    private Integer minutos;

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public void obtenerMinutos(){
        System.out.println("Introduce los minutos");
        this.minutos = sc.nextInt();
    }

    public void lema(){
        System.out.println("Sammy’s makes it fun in the sun");
    }

    public void calcularHoras(){
        int horas = this.minutos / 60;
        int precio = (horas * 40) + (this.minutos % 60);
        System.out.println("Tienes un total de " + horas + " horas y " + this.minutos%60 + " minutos");
        System.out.println("El costo por alquier es de " + precio );
    }
}
