package practice;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int[] winning = new int[6];
        Random random = new Random();
        boolean result = true;
        while (result) {
            System.out.print("로또번호 : ");
            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = random.nextInt(45) + 1;
                for (int j = 0; j < i; j++) {
                    if (lotto[i] == lotto[j]) {
                        i--;
                    }
                }
            }
            Arrays.sort(lotto);
            for (int i = 0; i < lotto.length; i++) {
                System.out.print(lotto[i] + " ");
            }

            System.out.print("\n당첨번호 : ");
            for (int i = 0; i < winning.length; i++) {
                winning[i] = random.nextInt(45) + 1;
                for (int j = 0; j < i; j++) {
                    if (winning[i] == winning[j]) {
                        i--;
                    }
                }
            }
            Arrays.sort(winning);
            for (int i = 0; i < winning.length; i++) {
                System.out.print(winning[i] + " ");
            }
            System.out.println("");
            if (Arrays.equals(winning, lotto)) {
                result = false;
            }
        }
    }
}
