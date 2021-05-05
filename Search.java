package BinarySearch;

public class Search {
    // new int[] { 0, 3 }
    public static int[] search(long[][] array, int rows, int columns, long target) {
        Range range = new Range(array, rows, columns);

        while (range.size() > 0) {
            long middleValue = range.getMiddleValue();
            if (target == middleValue) {
                return range.getMiddleIndex();
            } else if (target < middleValue) {
                range.discardRightPart();
            } else {
                range.discardLeftPart();
            }
        }

        // 只要返回特殊值表示没有找到即可
        return new int[] { -1, -1 };
        // return null;
    }
}
