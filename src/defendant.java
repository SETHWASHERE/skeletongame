import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/18/2017.
 */
public class defendant extends Enemy

{
    public defendant(String name_, int width_, int height_, String textureName_) {
        super(name_, width_, height_, textureName_);
        expGiven = 50;
        attack = 11;
        totalHealth = 120;
        currentHealth = totalHealth;
    }
}