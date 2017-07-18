import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
//import java.util.Scanner;

import java.awt.event.KeyEvent;

/**
 * Created by seth.riedy on 7/17/2017.
 */

    public class Hero_Player extends GameObject {
    int exp = 0;
    int herolevel = 1;
    int heroattack = 7;
    int herodefense = 2;
    int herohp = 10;
    boolean turn = true;

    int skeletonattack = 4;
    int skeletonenemyhp = 20;
    int zombieattack = 6;
    int zombieenemyhp = 30;
    int eviltreeattack = 8;
    int eviltreeenemyhp = 60;
    int representativeattack = 12;
    int representativeenemyhp = 90;
    int defendantattack = 14;
    int defendantenemyhp = 120;
    int limousineattack = 16;
    int limousineenemyhp = 160;
    int limousinedriverattack = 18;
    int limousinedriverenemyhp = 180;
    int guard1attack = 21;
    int guard1enemyhp = 210;
    int guard2attack = 23;
    int guard2enemyhp = 211;
    int receptionistattack = 300;
    int receptionistenemyhp = 10000;



    public Hero_Player() {
        super("Hero_player", 64, 64, "");
    }

    public void update() {

        while (turn == false)
        {
            System.out.println("Attack(A) || Die(D) || Heal(I)");

            if (InputManager.isTriggered(KeyEvent.VK_A))
            {
                skeletonenemyhp -= heroattack;

                if (skeletonenemyhp == 0)
                {
                    zombieenemyhp -= heroattack;

                    if (zombieenemyhp == 0)
                    {
                        eviltreeenemyhp -= heroattack;

                        if (eviltreeenemyhp == 0)
                        {
                            representativeenemyhp -= heroattack;

                            if (representativeenemyhp == 0)
                            {
                                defendantenemyhp -= heroattack;

                                if (defendantenemyhp == 0)
                                {
                                    limousineenemyhp -= heroattack;

                                    if (limousineenemyhp == 0)
                                    {
                                        limousinedriverenemyhp -= heroattack;

                                        if (limousinedriverenemyhp == 0)
                                        {
                                            guard1enemyhp -= heroattack;

                                            if (guard1enemyhp == 0)
                                            {
                                                guard2enemyhp -= heroattack;

                                                if (guard2enemyhp == 0)
                                                {
                                                    receptionistenemyhp -= heroattack;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (InputManager.isTriggered(KeyEvent.VK_D))
            {
                herohp = 0;
                System.out.println("you imploded.");
            }
            if (InputManager.isTriggered(KeyEvent.VK_I))
            {
                System.out.println("You reach into your inventory...\n" + "and pull out, a POTION!");
                if (herolevel == 1)
                {
                    herohp += 3;
                }
                if (herolevel == 2)
                {
                    herohp += 5;
                }
                if (herolevel == 3)
                {
                    herohp += 5;
                }
                if (herolevel == 4)
                {
                    herohp += 6;
                }
                if (herolevel == 5)
                {
                    herohp += 7;
                }
                if (herolevel == 6)
                {
                    herohp += 8;
                }
                if (herolevel == 7)
                {
                    herohp += 10;
                }
                if (herolevel == 8)
                {
                    herohp += 12;
                }
                if (herolevel == 9)
                {
                    herohp += 15;
                }
                if (herolevel == 10)
                {
                    herohp += 20;
                }
                if (herolevel == 11)
                {
                    herohp += 500;
                }
            }

            turn = true;
        }

        while (herolevel != 11)
        {
            if (exp == 10 || exp == 30 || exp == 60 || exp == 100 || exp == 150 || exp == 210 || exp == 280 || exp == 360 || exp == 450 || exp == 1000)
            {
                herolevel += 1;

                if (herolevel == 2)
                {
                    herohp += 2;
                    heroattack += 2;
                    herodefense += 2;

                    if (herolevel == 3)
                    {
                        herohp += 3;
                        heroattack += 5;
                        herodefense += 2;

                        if (herolevel == 4)
                        {
                            herohp += 5;
                            heroattack += 6;
                            herodefense += 2;

                            if (herolevel == 5)
                            {
                                herohp += 5;
                                heroattack += 10;
                                herodefense += 2;

                                if (herolevel == 6)
                                {
                                    herohp += 5;
                                    heroattack += 10;
                                    herodefense += 3;

                                    if (herolevel == 7)
                                    {
                                        herohp += 7;
                                        heroattack += 10;
                                        herodefense += 3;

                                        if (herolevel == 8)
                                        {
                                            herohp += 7;
                                            heroattack += 20;
                                            herodefense += 2;

                                            if (herolevel == 9)
                                            {
                                                herohp += 9;
                                                heroattack += 20;
                                                herodefense += 2;

                                                if (herolevel == 10)
                                                {
                                                    herohp += 5;
                                                    heroattack += 30;
                                                    herodefense += 3;

                                                    if (herolevel == 11)
                                                    {
                                                        herohp += 999;
                                                        heroattack += 999;
                                                        herodefense += 999;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}

