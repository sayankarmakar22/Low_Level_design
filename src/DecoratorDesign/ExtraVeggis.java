package DecoratorDesign;

public class ExtraVeggis implements ToppingDecorator{
    BasePizza basePizza;

    public ExtraVeggis(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
