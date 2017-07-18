import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/18/2017.
 */
public class limousine extends GameObject {

    int exp = 0;
    int herolevel = 1;
    int heroattack = 7;
    int herodefense = 2;
    int herohp = 10;

    int limousineattack = 16;
    int limousineenemyhp = 160;
    boolean turn = true;

    public limousine()
    {
        super("limousine", 64, 64, "");
    }

    public void update() {
        if (limousineenemyhp > 0)
        {
            while (turn == true)
            {
                herohp -= limousineattack;

                turn = false;
            }
        }
        if (limousineenemyhp == 0) {
            System.out.println("enemy defeated!");
            exp += 60;
            turn = true;
        }
    }
}

