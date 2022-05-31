package thisisjava.chap5;

import java.util.Arrays;

public class Exercise07 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 100, 2};
        int a =Arrays.stream(array).max().getAsInt();
        System.out.println("max: " + a);
    }
}
