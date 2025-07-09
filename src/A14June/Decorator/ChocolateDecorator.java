package A14June.Decorator;

public class ChocolateDecorator extends CoffeeDecorator{
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", With Chocolate";
    }
    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

}
