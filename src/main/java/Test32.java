import java.util.Scanner;

/*
打印倒三角星
 */
public class Test32 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入打印三角形的行数");
        int lines = scanner.nextInt();
        for(int i =0;i<lines;i++){
            for(int j = 0;j<lines-i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
