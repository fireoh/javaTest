import java.util.Scanner;
/*
案例：给定一个年份，判断是否是闰年
闰年的判断标准是：
1）可以被4整除，但不可被100整除
2）可以被400整除
 */
public class Test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
    }
}
