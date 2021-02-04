package SammysRentalPriceWithMethods;

public class Main {
    public static void main(String[] args) {
        SammysRentalPriceWithMethods a = new SammysRentalPriceWithMethods();
        Rental x = new Rental();


        /*a.setMinutos(80);
        a.lema();
        a.calcularHoras();*/

        x.setHoursAndMinutes(80);
        /*System.out.println(x.getMinutos());
        System.out.println(x.getnHoras());*/
        System.out.println(x.getPrecio());
        x.minutosxHoras();

        a.setMinutos(x.getMinutos());
        a.calcularHoras();




    }
}
