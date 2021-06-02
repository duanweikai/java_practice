package BinarySearch;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        long[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        int rows = 3;
        int columns = 5;

        for (long target = 0; target <= 16; target++) {
            int[] index = Search.search(array, rows, columns, target);

            System.out.printf("查找 %d 的结果是: %s\n", target, Arrays.toString(index));
        }
    }
}
