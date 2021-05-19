public class Add {
    public static void main(String[] args) {
        System.out.println(Add(1, 2));


    }
    public static int Add(int num1,int num2) {
        int sum = 0;
        int carry = 1;
        while (carry!=0)
        {
            sum = num1 ^ num2 ;
            carry = ( num1 & num2 ) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1 ;

    }
}
