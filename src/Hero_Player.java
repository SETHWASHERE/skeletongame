import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
//import java.util.Scanner;

import java.awt.event.KeyEvent;

/**
 * Created by seth.riedy on 7/17/2017.
 */

public class Hero_Player extends GameObject {
    int exp = 0;
    int level = 1;
    int attack = 7;
    int hp;
    int totalhp = 10;
    int healAmount = 1;
    boolean turn = true;
    int PlayerLevel = 1;

//    int skeletonattack = 4;
//    int skeletonenemyhp = 20;
//    int zombieattack = 6;
//    int zombieenemyhp = 30;
//    int eviltreeattack = 8;
//    int eviltreeenemyhp = 60;
//    int representativeattack = 12;
//    int representativeenemyhp = 90;
//    int defendantattack = 14;
//    int defendantenemyhp = 120;
//    int limousineattack = 16;
//    int limousineenemyhp = 160;
//    int limousinedriverattack = 18;
//    int limousinedriverenemyhp = 180;
//    int guard1attack = 21;
//    int guard1enemyhp = 210;
//    int guard2attack = 23;
//    int guard2enemyhp = 211;
//    int receptionistattack = 300;
//    int receptionistenemyhp = 10000;

    public Hero_Player() {
        super("Hero_player", 64, 64, "Hero_Asian.png");
        setPosition(-90, -76);
        hp = totalhp;
    }

    public void gainExp(int amount) {
        exp += amount;
        if (exp == 10 || exp == 30 || exp == 60 || exp == 100 || exp == 150 || exp == 210 || exp == 280 || exp == 360 || exp == 450 || exp == 1000) {
            level += 1;
            attack += 2;
        }
    }

    public void update() {
/*
        while (turn == false)
        {
            System.out.println("Attack(A) || Die(D) || Heal(I)");

            if (totalhp <= 0)
            {
                System.out.println("You couldn't change your name...\n" + "Game Over!");
            }
            if (InputManager.isTriggered(KeyEvent.VK_I))
            {
                System.out.println("You reach into your inventory...\n" + "and pull out, a POTION!");
                if (level == 1)
                {
                    hp += 3;
                }
                if (level == 2)
                {
                    hp += 5;
                }
                if (level == 3)
                {
                    hp += 5;
                }
                if (level == 4)
                {
                    hp += 6;
                }
                if (level == 5)
                {
                    hp += 7;
                }
                if (level == 6)
                {
                    hp += 8;
                }
                if (level == 7)
                {
                    hp += 10;
                }
                if (level == 8)
                {
                    hp += 12;
                }
                if (level == 9)
                {
                    hp += 15;
                }
                if (level == 10)
                {
                    hp += 20;
                }
                if (level == 11)
                {
                    hp += 500;
                }
            }

            turn = true;
        }

        while (level != 11)
        {


                if (level == 2)
                {
                    hp += 2;
                    attack += 2;

                    if (level == 3)
                    {
                        hp += 3;
                        attack += 5;

                        if (level == 4)
                        {
                            hp += 5;
                            attack += 6;

                            if (level == 5)
                            {
                                hp += 5;
                                attack += 10;

                                if (level == 6)
                                {
                                    hp += 5;
                                    attack += 10;

                                    if (level == 7)
                                    {
                                        hp += 7;
                                        attack += 10;

                                        if (level == 8)
                                        {
                                            hp += 7;
                                            attack += 20;

                                            if (level == 9)
                                            {
                                                hp += 9;
                                                attack += 20;

                                                if (level == 10)
                                                {
                                                    hp += 5;
                                                    attack += 30;

                                                    if (level == 11)
                                                    {
                                                        hp += 999;
                                                        attack += 999;
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
        }*/
    }
}

