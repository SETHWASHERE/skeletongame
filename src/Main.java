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

            if (herolevel == 2) {
                herohp += 2;
                heroattack += 2;
                herodefense += 2;
            }
            if (herolevel == 3) {
                herohp += 3;
                return herohp;
                heroattack += 5;
                return heroattack;
                herodefense += 2;
                return herodefense;
            }
            if (herolevel == 4) {
                herohp += 5;
                return herohp;
                heroattack += 6;
                return heroattack;
                herodefense += 2;
                return herodefense;
            }
            if (herolevel == 5) {
                herohp += 5;
                return herohp;
                heroattack += 10;
                return heroattack;
                herodefense += 2;
                return herodefense;
            }
            if (herolevel == 6) {
                herohp += 5;
                return herohp;
                heroattack += 10;
                return heroattack;
                herodefense += 3;
                return herodefense;
            }
            if (herolevel == 7) {
                herohp += 7;
                return herohp;
                heroattack += 10;
                return heroattack;
                herodefense += 3;
                return herodefense;
            }
            if (herolevel == 8) {
                herohp += 7;
                return herohp;
                heroattack += 20;
                return heroattack;
                herodefense += 2;
                return herodefense;
            }
            if (herolevel == 9) {
                herohp += 9;
                return herohp;
                heroattack += 20;
                return heroattack;
                herodefense += 2;
                return herodefense;
            }
            if (herolevel == 10) {
                herohp += 5;
                return herohp;
                heroattack += 30;
                return heroattack;
                herodefense += 3;
                return herodefense;
            }
            if (herolevel == 11) {
                herohp = 999;
                return herohp;
                heroattack = 999;
                return heroattack;
                herodefense = 999;
                return herodefense;
            }
        }

        return 0;
    }
}