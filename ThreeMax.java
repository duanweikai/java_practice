public class ThreeMax {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(findThird(arr));
    }

    private static int findThird(int[] arr) {
        int max1=0;
        int max2=0;
        int max3=0;
        for (int i : arr) {
            if(i==max1||i==max2||i==max3){
                continue;
            }
            if(i>max1){
                max3=max2;
                max2=max1;
                max1=i;
            }
            else if(i>max2){
                max3=max2;
                max2=i;
            }
            else if(i>max3){
                max3=i;
            }
        }
        if(max3==0){
            if(max2==0){
                return max1;
            }
            else return max2;
        }
        return max3;
    }
}
