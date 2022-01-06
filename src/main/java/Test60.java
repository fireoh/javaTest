import java.util.Objects;

/*
知识点：Object类的方法

案例：

1、声明三角形类，包含a,b,c三边
（1）属性私有化，提供无参，有参构造，提供get/set
（2）重写：toString()
（3）重写：hashCode和equals方法
（4）编写 public double getArea()：求面积方法
（5）编写 public double getPiremeter()：求周长方法

2、声明测试类Test12，在测试类中创建两个三角形对象，调用以上方法进行测试

 */
public class Test60 {
    public static void main(String[] args) {

    }
}

class Triangle01{
    private int a;
    private int b;
    private int c;
    Triangle01(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public double getPerimeter(){
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle01{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle01)) return false;
        Triangle01 that = (Triangle01) o;
        return getA() == that.getA() && getB() == that.getB() && getC() == that.getC();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }
}
