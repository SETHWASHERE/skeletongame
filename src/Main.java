/**
 * Created by seth.riedy on 7/17/2017.
 */
public class Main {
    public static int main(String[] args) {
        int exp = 0;

        int herolevel = 1;
        int heroattack = 7;
        int herodefense = 2;
        int herohp = 10;

        int skeletonattack = 4;
        int skeletondefense = 0;
        int skeletonenemyhp = 20;
        if (skeletonenemyhp == 0) {
            System.out.println("enemy defeated!");

            if (exp == 10 || exp == 30 || exp == 60 || exp == 100 || exp == 150 || exp == 210 || exp == 280 || exp == 360 || exp == 450 || exp == 1000) {
                herolevel += 1;
            }

            if (herolevel == 2)
            {
                herohp += 2;
                heroattack += 2;
                herodefense += 2;
            }
            if (herolevel == 3)
            {
                herohp += 3;
                heroattack += 5;
                herodefense += 2;
            }
            if (herolevel == 4)
            {
                herohp += 5;
                heroattack += 6;
                herodefense += 2;
            }
            if (herolevel == 5)
            {
                herohp += 5;
                heroattack += 10;
                herodefense += 2;
            }
            if (herolevel == 6)
            {
                herohp += 5;
                heroattack += 10;
                herodefense += 3;
            }
            if (herolevel == 7)
            {
                herohp += 7;
                heroattack += 10;
                herodefense += 3;
            }
            if (herolevel == 8)
            {
                herohp += 7;
                heroattack += 20;
                herodefense += 2;
            }
            if (herolevel == 9)
            {
                herohp += 9;
                heroattack += 20;
                herodefense += 2;
            }
            if (herolevel == 10)
            {
                herohp += 5;
                heroattack += 30;
                herodefense += 3;
            }
            if (herolevel == 11)
            {
                herohp += 999;
                heroattack += 999;
                herodefense += 999;
            }
        }

        return 0;
    }
}