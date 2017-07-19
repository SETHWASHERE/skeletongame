import edu.digipen.Game;
import edu.digipen.level.EmptyLevel;

import java.util.Scanner;
import java.util.logging.Level;

/**
 * Created by seth.riedy on 7/17/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        Game.initialize(300, 300, 60, new Level1());

        while(Game.getQuit() == false)
        {
            Game.update();
        }

        Game.destroy();
    }
}