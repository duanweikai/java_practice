import java.util.Scanner;
public class EnglishCode{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c >= 'A' && c < 'F'){
                    System.out.print((char)((int)c + 21));
                }else if(c > 'E' && c <= 'Z'){
                    System.out.print((char)((int)c - 5));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}