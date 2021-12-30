import java.util.Scanner;

/*
案例需求：编写一个程序，为一个给定的年份找出其对应的中国生肖。
中国的生肖基于12年一个周期，每年用一个动物代表：
rat（鼠）、ox（牛）、tiger（虎）、rabbit（兔）、dragon（龙）、snake（蛇）、
horse（马）、sheep（羊）、monkey（候）、rooster（鸡）、dog（狗）、pig（猪）。

 */
public class Test25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = scanner.nextInt();
        switch(year%12){
            case 1:
                System.out.println("鸡");
                break;
            case 2:
                System.out.println("狗");
                break;
            case 3:
                System.out.println("猪");
                break;
            case 4:
                System.out.println("鼠");
                break;
            case 5:
                System.out.println("牛");
                break;
            case 6:
                System.out.println("虎");
                break;
            case 7:
                System.out.println("兔");
                break;
            case 8:
                System.out.println("龙");
                break;
            case 9:
                System.out.println("蛇");
                break;
            case 10:
                System.out.println("马");
                break;
            case 11:
                System.out.println("羊");
                break;
            case 0:
                System.out.println("猴");
                break;
        }
    }
}
