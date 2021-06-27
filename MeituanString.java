import java.util.Scanner;
public class MeituanString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String string=scanner.next();
        char[] chars=string.toCharArray();
        int left=0;
        int right=n-1;
        for (char aChar : chars) {
            if (!(aChar == 'M')) {
                left++;
                break;
            }
        }
        for(right = n - 1; right >= 0; right --) {
            if(chars[right] == 'T'){
                right --;
                break;
            }
        }
        while (!(chars[left]=='T'&&chars[right]=='M')){
            if(chars[left]!='T'){
                left++;
            }
            if(chars[right]!='M'){
                left--;
            }
        }
        System.out.println(new String(chars).substring(left + 1, right));

    }
}
