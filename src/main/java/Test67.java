import javax.swing.*;

/*
模拟工人挑苹果。
定义苹果类：
属性：大小，颜色。
提供基本的构造方法和get方法，set方法
定义接口CompareAble：
定义默认方法compare，挑选较大苹果。
定义接口实现类CompareBig。
定义接口实现类CompareColor。挑选红色苹果。
定义工人类：
成员方法：挑选苹果public void pickApple(CompareAble c,Apple a1,Apple a2)。
测试类：
创建Worker对象。
创建两个Apple对象，一个Apple（5，"青色"）,一个Apple（3，"红色"）
 */
public class Test67 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Apple apple1 = new Apple(5,"青色");
        Apple apple2 = new Apple(3,"红色");
        worker.pickApple(new CompareBig(), apple1, apple2);
    }
}
class Apple{
    private int size;
    private String color;
    Apple(int size, String color){
        this.size=size;
        this.color=color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "size=" + size +
                ", color='" + color;

    }
}
interface CompareAble{
    default void compare(Apple a, Apple b){
        System.out.println();
    }
}
class CompareBig implements CompareAble{
    @Override
    public void compare(Apple a, Apple b) {
        if(a.getSize()>b.getSize()){
            System.out.println(a);
        }
    }
}

class CompareColor implements CompareAble{
    public void choose(Apple[] apples){
        for (int i = 0; i < apples.length; i++) {
            if(apples[i].getColor().equals("红色")){
                System.out.println(apples[i]);
            }
        }
    }
}

class Worker{
    public void pickApple(CompareAble c,Apple a1,Apple a2){
        c.compare(a1,a2);
    }
}