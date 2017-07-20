import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/18/2017.
 */
public class representative extends Enemy

{
    public representative(String name_, int width_, int height_, String textureName_) {
        super(name_, width_, height_, textureName_);
        expGiven = 40;
        attack = 8;
        totalHealth = 90;
        currentHealth = totalHealth;
    }
}