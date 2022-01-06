/*
知识点：方法的声明与调用、方法的重载
案例：
声明一个图形工具类GraphicTools，包含如下方法：
1、void printRectangle()：该方法打印5行5列*矩形
2、void printRectangle(int line, int column, String sign)：
该方法打印line行colomn列由sign组成的矩形
3、double getTriangleArea(double base, double height)：
根据底边和底边对应的高求三角形面积
 */
public class Test52 {
    public static void main(String[] args) {
        GraphicTools graphicTools = new GraphicTools();
        graphicTools.printRectangle();
        graphicTools.printRectangle(4,3,"!");
        System.out.println(graphicTools.getTriangleArea(4,5));
    }
}

class GraphicTools{
    void printRectangle(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    void printRectangle(int line, int column, String sign){
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sign);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    double getTriangleArea(double base, double height){
        return base*height/2;
    }
}