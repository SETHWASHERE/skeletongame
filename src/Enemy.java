import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/19/2017.
 */
public class Enemy extends GameObject
{
    public Enemy(String name_, int width_, int height_, String textureName_) {
        super(name_, width_, height_, textureName_);
        currentHealth = totalHealth;
    }

    public int expGiven;
    public int totalHealth;
    public int currentHealth;
    public int attack;

    public Hero_Player currentPlayer;

    public boolean TakeDamage(int damage)
    {
        currentHealth -= damage;
        if(currentHealth <= 0)
        {
            // I'm dead
            return true;
        }
        else
        {
            return false;
        }
    }

    public void DealDamage()
    {
        currentPlayer.hp -= attack;
    }
}
