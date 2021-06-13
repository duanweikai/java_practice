import java.util.HashSet;
import java.util.Set;

public class JewelAndStone {
    public static void main(String[] args) {
        String jewel="aA";
        String stone="aAdscasA";
        System.out.println(numJewelsInStones(jewel, stone));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int sum=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        for(int i=0;i<stones.length();i++){
            if(set.contains(stones.charAt(i))){
                sum++;
            }
        }
        return sum;
    }
}
