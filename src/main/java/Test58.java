/*
知识点：抽象类
案例：
1、声明抽象父类Person，包含抽象方法public abstract void pee();
2、声明子类Woman，重写抽象方法，打印坐着尿
3、声明子类Man，重写抽象方法，打印站着上尿
4、声明测试类Test10，创建Person数组，存放Woman和Man对象，并遍历数组，调用pee()方法

 */
public class Test58 {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Women();
        people[1] = new Man();
        for (Person person : people) {
            person.pee();
        }
    }
}

abstract class Person{
    public abstract void pee();
}

class Women extends Person{
    @Override
    public void pee() {
        System.out.println("坐着上厕所");
    }
}

class Man extends Person{
    @Override
    public void pee() {
        System.out.println("站着上厕所");
    }
}