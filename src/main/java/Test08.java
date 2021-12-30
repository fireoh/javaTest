/*
定义类 Test8
定义 main方法
定义2个int类型变量x、y，x赋值为100，y赋值为200
定义新变量add，保存变量x，y的和并打印到控制台
定义新变量sub，保存变量x，y的差并打印到控制台
定义新变量mul，保存变量x，y的积并打印到控制台
定义新变量div，保存变量x，y的商并打印到控制台
 */
public class Test08 {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int add = x + y;
        int sub = x - y;
        int mul = x * y;
        int div = x / y;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
