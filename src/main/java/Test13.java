/*
定义类 Test13
定义 main方法
定义char类型变量ch,赋值为'J'
使用强制转换的方式,将变量ch转换为小写'j',并输出
定义char类型变量ch2,赋值为'a'
使用-=的方式,将变量ch2转换为大写'A',并输出
定义double类型变量d3,int类型变量i3
定义double变量sum3,保存d3与i3的和,输出sum3的值和sum3去除小数部分的值
定义double类型变量d4,int类型变量i4
定义int变量mul4,保存d4和i4乘积的整数部分,并输出
 */
public class Test13 {
    public static void main(String[] args) {
        char ch = 'J';
        ch = (char)(ch + 32);
        System.out.println(ch);

        char ch2 = 'a';
        ch2-=32;
        System.out.println(ch2);

        double d3 = 100.1;
        int i3 = 100;
        double sum3 = d3 + i3;
        System.out.println((int)sum3);

        double d4 = 5.1;
        int i4 = 5;
        int mul4 = (int)(d4 * i4);
        System.out.println(mul4);
    }
}
