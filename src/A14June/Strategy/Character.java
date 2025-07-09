package A14June.Strategy;

public class Character {
    private AttackStrategy strategy;

    public void setStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void performAttack() {
        if (strategy != null) {
            strategy.attack();
        } else {
            System.out.println("No attack strategy set");
        }
    }
}
