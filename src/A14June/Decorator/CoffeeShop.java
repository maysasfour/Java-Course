package A14June.Decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee order = new BasicCoffee();
        System.out.println(order.getDescription() + ": $" + order.getCost());

        order = new MilkDecorator(order);
        System.out.println(order.getDescription() + ": $" + order.getCost());
        System.out.println("**************");
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new ChocolateDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + ": $" + coffee.getCost());

    }
}
