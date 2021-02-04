package School;

public class Student {
    private Integer ID;
    private Integer credito;
    private Integer puntos;

    public void inicializar(){
        this.setID(9999);
        this.setPuntos(12);
        this.setCredito(3);

    }

    public void setCredito(Integer credito) {
        this.credito = credito;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getCredito() {
        return credito;
    }

    public Integer getID(){
        return ID;
    }

    public Integer getPuntos(){
        return puntos;
    }

    public void promedioDeCalificaiones(int horas, int puntos){
        /*if ((puntos >= horas * 3) || (puntos >= )){
            //return 'a';
        }*/

    }
}
