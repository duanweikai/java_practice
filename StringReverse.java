import java.util.*;

public class StringReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuffer str=new StringBuffer(sc.nextLine());
        System.out.print(str.reverse());
    }
}