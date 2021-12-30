/*
定义类 Test11
定义 main方法
定义两个byte类型变量b1,b2,并分别赋值为10和20.
定义变量b3,保存b1和b2的和,并输出.
定义两个short类型变量s1,s2,并分别赋值为1000和2000.
定义变量s3,保存s1和s2的和,并输出.
定义一个char类型变量ch1赋值为'a',一个int类型变量i1赋值为30.
定义变量ch3,保存c1和i1的差,并输出.
 */
public class Test11 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 + b2;
        System.out.println(b3);

        short s1 = 1000;
        short s2 = 2000;
        int s3 = s1 + s2;
        System.out.println(s3);

        char ch1 = 'a';
        int i1 = 30;
        int ch3 = ch1 - i1;
        System.out.println(ch3);
    }
}
