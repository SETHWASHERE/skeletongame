import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/18/2017.
 */
public class guard2 extends GameObject {

    int exp = 0;
    int herolevel = 1;
    int heroattack = 7;
    int herodefense = 2;
    int herohp = 10;

    int guard2attack = 23;
    int guard2enemyhp = 211;
    boolean turn = true;

    public guard2()
    {
        super("guard2attack", 64, 64, "");
    }

    public void update() {
        if (guard2enemyhp > 0)
        {
            while (turn == true)
            {
                herohp -= guard2attack;

                turn = false;
            }
        }
        if (guard2enemyhp == 0) {
            System.out.println("enemy defeated!");
            exp += 90;
            turn = true;
        }
    }
}
