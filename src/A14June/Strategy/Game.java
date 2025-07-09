package A14June.Strategy;

public class Game {
    public static void main(String[] args) {
        Character character = new Character();

        character.setStrategy(new SwordAttack());
        character.performAttack();

        character.setStrategy(new MagicAttack());
        character.performAttack();

        character.setStrategy(new BowAttack());
        character.performAttack();
    }
}
