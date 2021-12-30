/*
案例：今天是周2，100天以后是周几？
定义类Test17
定义main方法
定义一个int类型变量week，赋值为2
修改week的值，在原值基础上加上100
因为week的值加上100后超过了星期的范围，重写修改week的值
输出结果，在输出结果的时候考虑特殊值，例如周日
 */
public class Test17 {
    public static void main(String[] args) {
        int week = 2;
        week += 100;
        week %= 7;
        System.out.println("今天是周2,100天以后是周" + (week==0?"日":week));
    }
}
