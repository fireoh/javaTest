/*
语法点：接口
按步骤编写代码，效果如图所示：
编写步骤：
定义接口A，普通类B实现接口A
A接口中，定义抽象方法showA。
A接口中，定义默认方法showB。
B类中，重写showA方法
测试类中，创建B类对象，调用showA方法，showB方法。
 */
public class Test64 {
    public static void main(String[] args) {
        BB bb = new BB();
        bb.showA();
        bb.showB();
    }
}

interface AA{
    abstract void showA();
    default void showB(){
        System.out.println("B...");
    }
}

class BB implements AA{
    @Override
    public void showA() {
        System.out.println("A....");
    }

}