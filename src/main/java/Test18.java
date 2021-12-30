/*
案例：求三个整数x,y,z中的最大值
定义类Test18
定义main方法
定义三个int类型变量,x,y,z，随意赋值整数值
定义一个int类型变量max，先存储x与y中的最大值（使用三元运算符）
再次对max赋值，让它等于上面max与z中的最大值（使用三元运算符）
输出结果
 */
public class Test18 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = 8;
        int max = x > y?x:y;
        max = z>max?z:max;
        System.out.println(max);
    }
}
