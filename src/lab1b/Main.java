package lab1b;

import lab1b.factory.EnemyFactory;
import lab1b.template.Difficulty;
import lab1b.template.Enemy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO Make the user choose the difficulty
        Difficulty difficulty =  Difficulty.NORMAL;

        List<Enemy> enemies = EnemyFactory.createEnemyGroup(difficulty);

        float totalAttack = 0.0f;

        for (Enemy e : enemies) {
            totalAttack += e.attack();
        }

        System.out.println(totalAttack);
    }
}
