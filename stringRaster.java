
import java.util.Scanner;

public class stringRaster {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[] chars;
        StringBuilder stringBuilder=new StringBuilder();
        while(scanner.hasNext()) {
            String string = scanner.nextLine();
            chars=string.toCharArray();
            for(int i=1;i<chars.length;i++){
                if(chars[i]=='_'){
                    chars[i+1]=Character.toUpperCase(chars[i+1]);
                }
            }
            for (char c : chars) {
                if(c!='_'){
                    stringBuilder.append(c);
                }
            }
            System.out.println(stringBuilder);
            stringBuilder.delete(0,stringBuilder.length());

        }
    }
}
