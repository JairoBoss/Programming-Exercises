package Sandwich;

public class Sandwich {

    private String ingredient;
    private String bread;
    private double price;

    public void setIngredient(String x){
        this.ingredient = x;
    }

    public void setBread(String x){
        this.bread = x;
    }

    public void setPrice(double x){
        this.price = x;
    }

    public String getIngredient(){
        return this.ingredient;
    }

    public String getBread(){
        return this.bread;
    }

    public double getPrice(){
        return this.price;
    }

}
