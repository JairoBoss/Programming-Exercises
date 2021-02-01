public class Percentages {
    public static void main(String[] args) {

        double x = 2;
        double y = 5;

        computePercent(x,y);

    }

    public static void computePercent(double x, double y){
//        double porcentaje = x / y * 100;
        System.out.println(x + " es el " + x / y * 100 + "% de " + y);
    }
}
