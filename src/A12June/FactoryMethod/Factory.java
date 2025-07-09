package A12June.FactoryMethod;

public class Factory {

    public static Pizza create(String ch) {
        Pizza obj = null;

        switch (ch) {
            case "Cheese":
                obj = new Cheese();
                break;
            case "Pepproni":
                obj = new Pepproni();
                break;
            default:
                System.out.println("Invalid pizza type");
                break;
        }

        return obj;
    }
}
