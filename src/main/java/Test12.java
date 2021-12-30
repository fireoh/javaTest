/*
定义类 Test12
定义 main方法
定义 int类型变量i1 和 long类型变量l1
定义变量add,保存i1和l1的和,并输出.
定义 long类型变量l2 和 float类型变量f2
定义变量add2,保存l2和f2的和,并输出.
定义 int类型变量i3 和 double类型变量d3
定义变量add3,保存i3和d3的和,并输出.
定义 float类型变量f4 和 double类型变量d4
定义变量add4,保存f4和d4的和,并输出
 */
public class Test12 {
    public static void main(String[] args) {
        int il = 100;
        long l1 = 100L;
        long add = il + l1;
        System.out.println(add);

        long l2 = 1000L;
        float f2 = 1000.1f;
        float add2 = l2 + f2;
        System.out.println(add2);

        int i3 = 200;
        double d3 = 200.1;
        double add3 = i3 + d3;
        System.out.println(add3);

        float f4 = 1.1F;
        double d4 = 1.1;
        double add4 = f4 + d4;
        System.out.println(add4);
    }
}
