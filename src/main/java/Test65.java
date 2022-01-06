/*
语法点：接口，多态
按步骤编写代码，效果如图所示：
编写步骤
定义接口Universe，提供抽象方法doAnything。
定义普通类Star，提供成员发光shine方法，打印“star:星星一闪一闪亮晶晶"
定义普通类Sun，
继承Star类，重写shine方法，打印"sun:光照八分钟，到达地球"
实现Universe接口，实现doAnything，打印"sun:太阳吸引着9大行星旋转"
测试类中，创建Star对象，调用shine方法
测试类中，多态的方式创建Sun对象，调用doAnything方法，向下转型，调用shine方法。
 */
public class Test65 {
    public static void main(String[] args) {
        Sun sun = new Sun();
        sun.doAnything();
        sun.shine();
    }
}
interface Universe{
    abstract void doAnything();
}
class Star{
    public void shine(){
        System.out.println("star:星星一闪一闪亮晶晶");
    }
}
class Sun extends Star implements Universe{
    @Override
    public void shine() {
        System.out.println("sun:光照八分钟，到达地球");
    }

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }
}