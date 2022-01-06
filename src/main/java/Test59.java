/*
知识点：抽象类
案例：
1、声明抽象父类Person，包含抽象方法public abstract void eat();
2、声明子类中国人Chinese，重写抽象方法，打印用筷子吃饭
3、声明子类美国人American，重写抽象方法，打印用刀叉吃饭
4、声明子类印度人Indian，重写抽象方法，打印用手抓饭
5、声明测试类Test11，创建Person数组，存储各国人对象，并遍历数组，调用eat()方法

 */
public class Test59 {
    public static void main(String[] args) {
        Person01[] person01 = new Person01[3];
        person01[0] = new Chinese();
        person01[1] = new American();
        person01[2] = new Indian();
        for (Person01 value : person01) {
            value.eat();
        }
    }
}
abstract class Person01{
    public abstract void eat();
}

class Chinese extends Person01{
    @Override
    public void eat() {
        System.out.println("用筷子吃饭");
    }
}


class American extends Person01{
    @Override
    public void eat() {
        System.out.println("用刀叉吃饭");
    }
}

class Indian extends Person01{
    @Override
    public void eat() {
        System.out.println("用手抓饭");
    }
}