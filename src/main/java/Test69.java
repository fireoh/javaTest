/*
案例：
1、声明颜色枚举类：
      7个常量对象：赤、橙、黄、绿、青、蓝、紫。
2、在测试类中，使用枚举类，获取绿色对象，并打印对象。
 */
public class Test69 {
    public static void main(String[] args) {
        Color color = Color.GREEN;
        System.out.println(color);
    }
}
enum Color{
    RED,ORANGE,YELLOW,GREEN,CYAN,BLUE,PURPLE
}
