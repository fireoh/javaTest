/*
定义类 Test07
定义 main方法
定义两个整数变量a，b并赋值
控制台输出变量a，b互换前的值
定义一个第三方变量temp，使a，b的值互换
控制台输出变量a，b互换后的值
 */
public class Test07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        temp = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b);

    }
}
