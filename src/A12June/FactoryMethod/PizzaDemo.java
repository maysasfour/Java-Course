package A12June.FactoryMethod;

public class PizzaDemo {
    public static void main(String[] args) {
        System.out.println("Enter 1 cheese\nEnter 2 Pepproni");
        String ch="cheese";
        Pizza obj=Factory.create(ch);
        obj.prepere();

        Pizza myPizza = Factory.create("Cheese");
        if (myPizza != null) {
            myPizza.prepere();
        }

    }
}
