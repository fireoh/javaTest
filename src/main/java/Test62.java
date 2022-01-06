/*
案例：
1、声明图形Graphic、圆Circle、矩形Rectangle类、三角形Triangle类
2、图形Graphic类中有：
①public double getArea()方法：返回面积
②public double getPerimeter()方法：返回周长
③public String getInfo()方法：返回图形信息
3、圆类,矩形,三角形类重写这两个方法
4、声明测试类Test14_1
(1)请设计一个方法，可以用于比较两个图形的面积是否相等
(2)请设计一个方法，可以用于找出两个图形中面积大的那个
(3)public static void main(String[] args){}
在主方法中，创建1个圆、1个矩形、1个三角形对象，并分别调用(1)、(2)方法进行测试。
5、测试类Test14_2
(1)请设计一个方法，可以用于遍历一个图形数组
(2)请设计一个方法，可以用于给一个图形数组进行按照面积从小到大排序
(3)public static void main(String[] args){}
在主方法中，创建1个圆、1个矩形、1个三角形对象，放到数组中，遍历显示，然后排序后再遍历显示。

 */
public class Test62 {
    public static void main(String[] args) {
        Test62 test62 = new Test62();
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2,3);
        Triangle02 triangle02 = new Triangle02(4,4,5);
        System.out.println(test62.common(rectangle,triangle02));
        test62.judge(rectangle,circle);
        Graphic[] graphics = {circle, rectangle, triangle02};
        test62.sort(graphics);
    }
    public boolean common(Graphic a , Graphic b){
        return a.getArea() == b.getArea();
    }
    public void judge(Graphic a , Graphic b){
        if(a.getArea()>b.getArea()){
            System.out.println(a.getInfo());
        }else {
            System.out.println(b.getInfo());
        }
    }
    public void sort(Graphic[] graphics){
        Graphic temp;
        for (int i = 1; i < graphics.length; i++) {
            for (int j = 0; j < graphics.length-1; j++) {
                if(graphics[j].getArea()>graphics[j+1].getArea()){
                    temp = graphics[j];
                    graphics[j] = graphics[j+1];
                    graphics[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < graphics.length; i++) {
            System.out.println(graphics[i].getInfo());
        }
    }
}

abstract class Graphic{
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getInfo();
}

class Circle extends Graphic{
    double a;
    Circle(double a){
        this.a=a;
    }
    @Override
    public double getArea() {
        return 3.14*a*a;
    }

    @Override
    public double getPerimeter() {
        return 3.14*a*2;
    }

    @Override
    public String getInfo() {
        return "一个圆";
    }
}

class Rectangle extends Graphic{
    double a;
    double b;
    Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return (a+b)*2;
    }

    @Override
    public String getInfo() {
        return "一个矩形";
    }
}

class Triangle02 extends Graphic{
    double a;
    double b;
    double c;
    Triangle02(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public String getInfo() {
        return "一个三角形";
    }
}