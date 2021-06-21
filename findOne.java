public class findOne {
    public static void main(String[] args) {
        int n=8;
        System.out.println(hammingWeight(n));

    }
    public static int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;      //Java中的右移
        }
        return res;
    }
}
