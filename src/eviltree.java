import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/18/2017.
 */
public class eviltree extends Enemy
{
    public eviltree(String name_, int width_, int height_, String textureName_) {
        super(name_, width_, height_, textureName_);
        expGiven = 30;
        attack = 6;
        totalHealth = 60;
        currentHealth = totalHealth;
    }
}