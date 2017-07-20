/**
 * Created by seth.riedy on 7/20/2017.
 */
public class receptionist extends Enemy
{
        public receptionist(String name_, int width_, int height_, String textureName_) {
        super(name_, width_, height_, textureName_);
        expGiven = 60;
        attack = 14;
        totalHealth = 200;
        currentHealth = totalHealth;
    }
}
