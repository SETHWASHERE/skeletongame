import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/18/2017.
 */
public class defendant extends GameObject {

    int exp = 0;
    int herolevel = 1;
    int heroattack = 7;
    int herodefense = 2;
    int herohp = 10;

    int defendantattack = 14;
    int defendantenemyhp = 120;
    boolean turn = true;

    public defendant()
    {
        super("defendant", 64, 64, "");
    }

    public void update() {
        if (defendantenemyhp > 0)
        {
            while (turn == true)
            {
                herohp -= defendantattack;

                turn = false;
            }
        }
        if (defendantenemyhp == 0) {
            System.out.println("enemy defeated!");
            exp += 50;
            turn = true;
        }
    }
}
