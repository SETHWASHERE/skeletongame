import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/18/2017.
 */
public class guard1 extends GameObject {

    int exp = 0;
    int herolevel = 1;
    int heroattack = 7;
    int herodefense = 2;
    int herohp = 10;

    int guard1attack = 21;
    int guard1enemyhp = 210;
    boolean turn = true;

    public guard1()
    {
        super("guard1", 64, 64, "");
    }

    public void update() {
        if (guard1enemyhp > 0)
        {
            while (turn == true)
            {
                herohp -= guard1attack;

                turn = false;
            }
        }
        if (guard1enemyhp == 0) {
            System.out.println("enemy defeated!");
            exp += 80;
            turn = true;
        }
    }
}
