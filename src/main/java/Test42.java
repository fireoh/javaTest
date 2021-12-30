import java.util.Scanner;

/*
从键盘输入一个英语单词，然后查找这个单词中是否存在'a'字母
提示：把字符串转成字符数组，可以使用String类型的toCharArray()方法
 */
public class Test42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个单词");
        String word = scanner.next();
        char[] arr = word.toCharArray();
        boolean b1 = false;
        for (char c : arr) {
            if (c == 'a') {
                System.out.println("存在");
                b1 = true;
                break;
            }
        }
        if(!b1){
            System.out.println("不存在");
        }
    }
}
