import java.util.Scanner;

/*
案例：从键盘输入一个整数，判断它是奇数还是偶数（这里把0归为偶数）
 */
public class Test21 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数");
            int num = scanner.nextInt();
            if(num % 2 ==0){
                System.out.println("偶数");
            }else {
                System.out.println("奇数");
            }
        }catch (Throwable e){
            System.out.println("输入的数不是整数");
        }

    }
}
