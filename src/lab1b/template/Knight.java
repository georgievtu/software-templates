package lab1b.template;

public class Knight extends Enemy {
    public Knight(int level) {
        super(level);
    }

    @Override
    protected boolean calculateHitChance() {
        // TODO The knight always hits
        return false;
    }

    @Override
    protected float calculateDamage() {
        // TODO The knight does 10 * level damage
        return 0;
    }
}
