import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/18/2017.
 */
public class receptionist extends GameObject {

    int exp = 0;
    int herolevel = 1;
    int heroattack = 7;
    int herodefense = 2;
    int herohp = 10;

    int receptionistattack = 300;
    int receptionistenemyhp = 10000;
    boolean turn = true;

    public receptionist()
    {
        super("receptionist", 64, 64, "");
    }

    public void update() {
        if (receptionistenemyhp > 0)
        {
            while (turn == true)
            {
                herohp -= receptionistattack;

                turn = false;
            }
        }
        if (receptionistenemyhp == 0) {
            System.out.println("enemy defeated!");
            exp += 550;
            turn = true;
        }
    }
}

