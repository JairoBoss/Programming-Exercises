package Bank;

public class BankAccount {
    private Integer numero;
    private String nombre;
    private double saldo;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deductMonthlyFee(){
        this.saldo = 4.00;
    }

    public void ExpliqueAccountPolicy(){
        System.out.println("La tarifa de servicio de $ 4 se deducirá cada mes.");
    }


}
