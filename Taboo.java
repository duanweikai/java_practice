import java.util.Scanner;

public class Taboo {

    static int[] totalday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int[] totalMoney = {62, 28, 31, 60, 31, 60, 31, 62, 60, 62, 30, 62};
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int year1=scanner.nextInt();
            int month1=scanner.nextInt();
            int day1=scanner.nextInt();
            int year2=scanner.nextInt();
            int month2=scanner.nextInt();
            int day2=scanner.nextInt();
            int total_num=0;
            if(year1 == year2){
                //同一年份
                if(month1 == month2){
                    //同一月份
                    total_num =  Caclue_Day(day1, day2, month1);
                }
                else{
                    //不同月份
                    //1、先计算两者相差整月份的收益
                    total_num += Caclue_Month(month1, month2, year1);
                    //2、month1首月不足一月的天数收益
                    total_num += Caclue_Day(day1, totalday[month1 - 1], month1);
                    //3、month2尾月不足一月的天数收益
                    total_num += Caclue_Day(1, day2, month2);
                }
            }
            else{
                //不同年份
                //1、先计算两者相差整年份的收益
                total_num += Caclue_Year(year1 + 1, year2 - 1);
                //2、year1年份不足一年整月份的收益
                total_num += Caclue_Month(month1 + 1, 12, year1);
                //3、year2年份不足一年整月份的收益
                total_num += Caclue_Month(1, month2 - 1, year2);
                //4、year1中首月不足一月的收益
                total_num += Caclue_Day(day1, totalday[month1 - 1], month1);
                //5、year2中尾月不足一月的收益
                total_num += Caclue_Day(1, day2, month2);
            }
            System.out.println(total_num);

        }

    }

    private static int Caclue_Year(int year1, int year2) {
        int sum=0;
        for(int i=year1;i<year2;++i){
            sum+=Caclue_Month(1,12,i);
        }
        return sum;

    }

    private static int Caclue_Month(int month1, int month2, int year1) {
        int sum = 0;
        for(int i = month1; i <= month2; ++i){
            //下标-1
            sum += totalMoney[i - 1];
            //2月 - 闰年 - 多加1块
            if(i == 2 && judge(year1)){
                sum += 1;
            }
        }
        return sum;

    }

    private static boolean judge(int year1) {
        return year1 % 400 == 0 || (year1 % 4 == 0 && year1 % 100 != 0);
    }

    private static int Caclue_Day(int day1, int day2, int month1) {
        int sum=day2-day1+1;
        if(is_Prime(month1)){
            return sum;
        }
        else
            sum+=sum;
        return sum;
    }

    private static boolean is_Prime(int month1) {
        return month1 == 2 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 11;
    }
}
