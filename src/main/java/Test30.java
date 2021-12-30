import java.util.Scanner;

/*
案例需求：从键盘分别输入年、月、日，使用循环for+if实现，判断这一天是当年的第几天
 */
public class Test30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年:");
        int year = scanner.nextInt();
        System.out.println("请输入月:");
        int month = scanner.nextInt();
        System.out.println("请输入日");
        int day = scanner.nextInt();
        int days = day;
        for (int i = 1; i < month; i++) {
            if(i==1){
                days+=31;
            }else if(i==2){
                if(year%4==0 && year%100!=0 || year%400==0){
                    days+=29;
                }else {
                    days+=28;
                }
            }else if(i==3){
                days+=31;
            }else if(i==4){
                days+=30;
            }else if(i==5){
                days+=31;
            }else if(i==6){
                days+=30;
            }else if(i==7){
                days+=31;
            }else if(i==8){
                days+=31;
            }else if(i==9){
                days+=30;
            }else if(i==10){
                days+=31;
            }else if(i==11){
                days+=30;
            }else if(i==12){
                days+=31;
            }
        }
        System.out.println(month+"月"+day+"日是"+year+"的"+days+"天");
    }
}
