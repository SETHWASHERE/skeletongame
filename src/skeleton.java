import edu.digipen.gameobject.GameObject;

import java.awt.event.KeyEvent;

/**
 * Created by seth.riedy on 7/17/2017.
 */
public class skeleton extends GameObject
{
    int exp = 0;
    int herolevel = 1;
    int heroattack = 7;
    int herodefense = 2;
    int herohp = 10;

    int skeletonattack = 4;
    int skeletonenemyhp = 20;
    boolean turn = true;

    public skeleton()
    {
        super("skeleton", 64, 64, "");
    }

    public void update()
    {
        if (skeletonenemyhp > 0)
        {
            while (turn == true)
            {
                herohp -= skeletonattack;

                turn = false;
            }
        }
        if (skeletonenemyhp == 0)
        {
            System.out.println("enemy defeated!");
            exp += 10;
            turn = true;
        }
    }
}
