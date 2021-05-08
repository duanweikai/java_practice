import java.util.*;

public class StringMatch {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String key = in.next();
            String str = in.next();
            int num = 0;
            boolean flag = true;
            for(int i = 0; i < str.length(); i++){
                if(key.charAt(num) != '?' && key.charAt(num) != '*' &&key.charAt(num) != str.charAt(i)){
                    flag = false;
                    break;
                }
                if(key.charAt(num) == str.charAt(i) || key.charAt(num) == '?'){
                    num++;
                    continue;
                }
                if(num + 1 < str.length() && i + 1 < str.length()){
                    if(key.charAt(num + 1) == str.charAt(i + 1)){
                        num++;
                        continue;
                    }
                }
                if(key.charAt(num) == '*')
                    continue;
            }
            System.out.println(flag);
        }
        in.close();
    }
}

