/*
定义类 Test9
定义 main方法
定义2个double类型变量x、y，x赋值为100.8，y赋值为20.6
定义新变量add，保存变量x，y的和并打印到控制台
定义新变量sub，保存变量x，y的差并打印到控制台
定义新变量mul，保存变量x，y的积并打印到控制台
定义新变量div，保存变量x，y的商并打印到控制台
 */
public class Test09 {
    public static void main(String[] args) {
        double x = 100.8;
        double y = 20.6;
        double add = x + y;
        double sub = x - y;
        double mul = x * y;
        double div = x / y;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
