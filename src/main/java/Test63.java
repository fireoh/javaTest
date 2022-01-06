/*
1、声明人Person、男人Man、女人Woman类
（1）在Person类中，包含
①public void eat()：打印吃饭
②public void toilet()：打印上洗手间
（2）在Man类中，包含
①重写上面的方法
②增加 public void smoke()：打印抽烟
（3）在Woman类中，包含
①重写上面的方法
②增加 public void makeup()：打印化妆
2、声明测试类Test15
（1）public static void meeting(Person... ps)
在该方法中，每一个人先吃饭，然后上洗手间，然后如果是男人，随后抽根烟，如果是女人，随后化个妆
（2）public static void main(String[] args)
在主方法中，创建多个男人和女人对象，并调用meeting()方法进行测试
 */
public class Test63 {
    public static void main(String[] args) {
        Man01 man01 = new Man01();
        Woman01 woman01 = new Woman01();
        Man01 man02 = new Man01();
        Woman01 woman02 = new Woman01();
        Test63 test63 = new Test63();
        test63.meeting(man01,woman01,man02,woman02);
    }
    public static void meeting(Person02... ps){
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Man01){
                ((Man01) ps[i]).smoke();
            }else {
                ((Woman01)ps[i]).makeup();
            }
        }
    }
}

class Person02{
    public void eat(){
        System.out.println("吃饭");
    }
    public void toilet(){
        System.out.println("上厕所");
    }
}

class Man01 extends Person02{
    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("男人上厕所");
    }
    public void smoke(){
        System.out.println("抽烟");
    }
}

class Woman01 extends Person02{
    @Override
    public void eat() {
        System.out.println("女生吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("女人上厕所");
    }
    public void makeup(){
        System.out.println("化妆");
    }
}