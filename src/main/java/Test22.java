import java.util.Scanner;

/*
案例：从键盘输入一个字符，判断它是字母还是数字，还是其他字符
 */
public class Test22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符：");
        char c = scanner.next().charAt(0);
        if(c >= '0' && c <= '9'){
            System.out.println(c + "是数字.");
        }else if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
            System.out.println(c + "是字母.");
        }else{
            System.out.println(c + "非数字非字母的其他字符.");
        }
    }
}
