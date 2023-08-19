package DecoratorDesign;

public class Driver {
    public static void main(String[] args) {
        BasePizza pizza = new MashroomPizza();

        pizza = new ExtraVeggis(pizza);
        pizza = new ExtraCheese(pizza);

        System.out.println(pizza.cost());
    }
}
