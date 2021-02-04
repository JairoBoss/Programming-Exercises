package Sandwich;

public class TestSandwich {
    public static void main(String[] args) {
        Sandwich chanwich = new Sandwich();

        chanwich.setBread("Bimbo XD");
        chanwich.setIngredient("Jamon");
        chanwich.setPrice(9.99);

        System.out.println(chanwich.getBread());
        System.out.println(chanwich.getIngredient());
        System.out.println(chanwich.getPrice());
    }

}
