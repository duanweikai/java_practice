package BinarySearch;

public class Range {
    private final long[][] array;
    private final int columns;

    private int lowRow;
    private int lowColumn;

    private int highRow;
    private int highColumn;

    public Range(long[][] array, int rows, int columns) {
        this.array = array;
        this.columns = columns;

        this.lowRow = 0;
        this.lowColumn = 0;

        this.highRow = rows - 1;
        this.highColumn = columns - 1;
    }

    public int size() {
        return (columns - lowColumn) + ((highRow - lowRow - 1) * columns) + (highColumn + 1);
    }

    public long getMiddleValue() {
        int[] index = getMiddleIndex();
        int row = index[0];
        int column = index[1];

        return array[row][column];
    }

    public int[] getMiddleIndex() {
        int halfSize = size() / 2;

        int middleRow = lowRow;
        int middleColumn = lowColumn;
        middleColumn += halfSize;

        // middleColumn 还不是一个合法下标
        while (middleColumn >= columns) {
            middleRow++;
            middleColumn -= columns;
        }

        return new int[] { middleRow, middleColumn };
    }

    public void discardRightPart() {
        // 让 high 往左走，不包括 middle 位置
        int[] index = getMiddleIndex();
        int row = index[0];
        int column = index[1];

        highRow = row;
        highColumn = column - 1;    // 不要中间位置
        if (highColumn < 0) {
            highRow--;
            highColumn = columns - 1;
        }
    }

    public void discardLeftPart() {
        // 让 low 往右做，不包括 middle 位置
        int[] index = getMiddleIndex();
        int row = index[0];
        int column = index[1];

        lowRow = row;
        lowColumn = column + 1;     // 不要中间位置
        if (lowColumn >= columns) {
            lowRow++;
            lowColumn = 0;
        }
    }
}
