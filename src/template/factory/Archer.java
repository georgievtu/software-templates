package template.factory;

public class Archer extends Enemy {
    public Archer(int level) {
        super(level);
    }

    @Override
    protected boolean calculateHitChance() {
        // TODO The archer has a 50% chance to hit. Use a random number generator
        return false;
    }

    @Override
    protected float calculateDamage() {
        // TODO The archer does 5 * level damage
        return 0;
    }
}
