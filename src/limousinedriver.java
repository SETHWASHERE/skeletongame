import edu.digipen.gameobject.GameObject;

/**
 * Created by seth.riedy on 7/18/2017.
 */
public class limousinedriver extends GameObject {

    int exp = 0;
    int herolevel = 1;
    int heroattack = 7;
    int herodefense = 2;
    int herohp = 10;

    int limousinedriverattack = 18;
    int limousinedriverenemyhp = 180;
    boolean turn = true;

    public limousinedriver()
    {
        super("limousinedriver", 64, 64, "");
    }

    public void update() {
        if (limousinedriverenemyhp > 0)
        {
            while (turn == true)
            {
                herohp -= limousinedriverattack;

                turn = false;
            }
        }
        if (limousinedriverenemyhp == 0) {
            System.out.println("enemy defeated!");
            exp += 70;
            turn = true;
        }
    }
}
