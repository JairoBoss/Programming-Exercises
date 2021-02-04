package SammysRentalPriceWithMethods;

public class Rental {
    private String nContrato;
    private Integer horas;
    private Integer minutos;
    private Integer precio;

    public String getnContrato() {
        return nContrato;
    }

    public void setContractNumber(String nContrato) {
        this.nContrato = nContrato;
    }

    public void setnContrato(String nContrato) {
        this.nContrato = nContrato;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getnHoras() {
        return horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setHoursAndMinutes(Integer minutos) {
        this.minutos = minutos;
        this.horas = this.minutos / 60;
        this.precio = (this.horas * 40) + (this.minutos % 60);
    }

    public Integer getPrecio() {
        return precio;
    }

    public void minutosxHoras(){
        System.out.println("Tienes un total de " + this.horas + " horas y " + this.minutos%60 + " minutos");
        System.out.println("El costo por alquier es de " + this.precio );
    }
}
