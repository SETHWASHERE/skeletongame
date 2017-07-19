import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;

import java.rmi.server.Skeleton;

/**
 * Created by seth.riedy on 7/19/2017.
 */
public class Level1 extends GameLevel
{
    Hero_Player activePlayer;
    Enemy currentEnemy;

    skeleton firstEnemy;
    boolean turn;

    @Override
    public void create() {
        firstEnemy = new skeleton("Skeleton",200, 200, "pixil-frame-0.png");
        firstEnemy.setOpacity(0);
        ObjectManager.addGameObject(currentEnemy);


        currentEnemy = firstEnemy;
        currentEnemy.currentPlayer = activePlayer;
        currentEnemy.setOpacity(1);
        turn = false;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void update(float v) {
        // Enemy attack
        if(turn == true) {
            currentEnemy.DealDamage();
            turn = false;
        }
        else {
            // What choice did the player make..

            if (currentEnemy.TakeDamage(activePlayer.attack)) {
                activePlayer.exp += currentEnemy.expGiven;
                // currentEnemy = nextEnemy;
            }

            turn = true;
        }
    }

    @Override
    public void uninitialize() {

    }
}
