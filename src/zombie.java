import edu.digipen.gameobject.GameObject;

/**
* Created by seth.riedy on 7/18/2017.
        */
public class zombie extends GameObject {

    int exp = 0;
    int herolevel = 1;
    int heroattack = 7;
    int herodefense = 2;
    int herohp = 10;

    int zombieattack = 6;
    int zombieenemyhp = 30;
    boolean turn = true;

    public zombie()
    {
        super("zombie", 64, 64, "");
    }

    public void update() {
        if (zombieenemyhp > 0)
        {
            while (turn == true)
            {
                herohp -= zombieattack;

                turn = false;
            }
        }
        if (zombieenemyhp == 0) {
            System.out.println("enemy defeated!");
            exp += 20;
            turn = true;
        }
    }
}
