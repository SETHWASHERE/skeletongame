import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/18/2017.
 */
public class representative extends GameObject {

    int exp = 0;
    int herolevel = 1;
    int heroattack = 7;
    int herodefense = 2;
    int herohp = 10;

    int representativeattack = 12;
    int representativeenemyhp = 90;
    boolean turn = true;

    public representative()
    {
        super("representative", 64, 64, "");
    }

    public void update() {
        if (representativeenemyhp > 0)
        {
            while (turn == true)
            {
                herohp -= representativeattack;

                turn = false;
            }
        }
        if (representativeenemyhp == 0) {
            System.out.println("enemy defeated!");
            exp += 40;
            turn = true;
        }
    }
}

