import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/18/2017.
 */
public class eviltree extends GameObject {

    int exp = 0;
    int herolevel = 1;
    int heroattack = 7;
    int herodefense = 2;
    int herohp = 10;

    int eviltreeattack = 8;
    int eviltreeenemyhp = 60;
    boolean turn = true;

    public eviltree()
    {
        super("eviltree", 64, 64, "");
    }

    public void update() {
        if (eviltreeenemyhp > 0)
        {
            while (turn == true)
            {
                herohp -= eviltreeattack;

                turn = false;
            }
        }
        if (eviltreeenemyhp == 0) {
            System.out.println("enemy defeated!");
            exp += 30;
            turn = true;
        }
    }
}
