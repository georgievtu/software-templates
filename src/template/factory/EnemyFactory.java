package template.factory;

import java.util.ArrayList;
import java.util.List;

public class EnemyFactory {
    public static List<Enemy> createEnemyGroup(Difficulty difficulty) {
        List<Enemy> enemies = new ArrayList<>();
        switch (difficulty) {
            case NORMAL:
                // TODO 1 level 5 archer and 1 level 5 knight
                break;
            case HARD:
                // TODO 2 level 10 knights
                break;
        }
        return enemies;
    }
}
