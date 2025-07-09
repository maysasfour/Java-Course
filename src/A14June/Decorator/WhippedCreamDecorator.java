package A14June.Decorator;

public class WhippedCreamDecorator extends CoffeeDecorator
{
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription()
    {
        return super.getDescription() + ", With WhippedCream";
    }
    @Override
    public double getCost()
    {
        return super.getCost() + 2.0;
    }

}
