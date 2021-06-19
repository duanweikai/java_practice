import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dictWord {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak1(s, wordDict));


    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> word=new HashSet<>(wordDict);
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&word.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }

            }
        }
        return dp[s.length()];
    }
    public static boolean wordBreak1(String s, List<String> wordDict){
        boolean[] canBreak=new boolean[s.length()+1];
        for(int i=1;i<=s.length();i++){
            if(wordDict.contains(s.substring(0,i))){
                canBreak[i]=true;
                continue;
            }
            for(int j=i-1;j>0;j--){
                if(canBreak[j]&&wordDict.contains(s.substring(j,i))){
                    canBreak[i]=true;
                    break;
                }
            }
        }
        return canBreak[s.length()];

    }
}
