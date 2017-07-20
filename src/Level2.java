import edu.digipen.Game;
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;
import java.rmi.server.Skeleton;

/**
 * Created by seth.riedy on 7/19/2017.
 */
public class Level2 extends GameLevel
{
    Hero_Player activePlayer;
    Enemy currentEnemy;

    zombie firstEnemy;
    boolean turn;

    @Override
    public void create() {
        Hero_Player Hero = new Hero_Player();
        activePlayer = Hero;
        ObjectManager.addGameObject(Hero);

        firstEnemy = new zombie("Zombie",200, 200, "zombie.png");
        firstEnemy.currentPlayer = activePlayer;
        firstEnemy.setOpacity(1);
        ObjectManager.addGameObject(firstEnemy);


        currentEnemy = firstEnemy;
        turn = false;
    }

    @Override
    public void initialize() {
        System.out.println("Player Health: " + activePlayer.hp);
        System.out.println("Enemy  Health: " + currentEnemy.currentHealth);

    }

    @Override
    public void update(float v) {
        // Enemy attack
        if(turn == true) {
            currentEnemy.DealDamage();
            turn = false;
            System.out.println("Player Health: " + activePlayer.hp);
        }
        else {
            // What choice did the player make..

            if(InputManager.isTriggered(KeyEvent.VK_A)) {
                if (currentEnemy.TakeDamage(activePlayer.attack)) {
                    activePlayer.exp += currentEnemy.expGiven;
                    // currentEnemy = nextEnemy;
                }
                turn = true;
                System.out.println("Enemy  Health: " + currentEnemy.currentHealth);
            }
            if (InputManager.isTriggered(KeyEvent.VK_I))
            {
                System.out.println("You reach into your inventory...\n" + "and pull out, a POTION!");
                activePlayer.hp += 5;
                {
                    turn = true;
                    System.out.println("Enemy  Health: " + currentEnemy.currentHealth);
                }
            }
        }
        if(currentEnemy.currentHealth <= 0)
        {
            activePlayer.hp += 3;
            activePlayer.attack += 5;
            GameLevelManager.goToLevel(new Level2());
        }
        if(activePlayer.hp <= 0)
        {
            Game.quit();
        }
    }

    @Override
    public void uninitialize() {

    }
}
