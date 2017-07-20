import edu.digipen.gameobject.GameObject;

/**
* Created by seth.riedy on 7/18/2017.
        */
public class zombie extends Enemy
{
    public zombie(String name_, int width_, int height_, String textureName_) {
        super(name_, width_, height_, textureName_);
        expGiven = 20;
        attack = 5;
        totalHealth = 30;
        currentHealth = totalHealth;
    }
}