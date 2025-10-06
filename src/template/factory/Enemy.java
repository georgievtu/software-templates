package template.factory;

public abstract class Enemy {
    public Enemy(int level) {
        this.level = level;
    }

    // Template method
    public final float attack() {
        boolean willHit = calculateHitChance();
        if (!willHit)
            return 0.0f;

        return calculateDamage();
    }

    protected abstract boolean calculateHitChance();
    protected abstract float calculateDamage();

    private int level;
}
