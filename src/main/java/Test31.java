import java.util.Scanner;

/*
案例需求：假设从2000年1月1日开始三天打鱼，两天晒网，从键盘输入今天的日期年、月、日，显示今天是打鱼还是晒网？
 */
public class Test31 {
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
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                days += 30;
            } else if (i == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days += 29;
                } else {
                    days += 28;
                }
            } else {
                days += 31;
            }
        }
        if(days%5==4||days%5==0){
            System.out.println("晒网");
        }else {
            System.out.println("打鱼");
        }

    }
}
