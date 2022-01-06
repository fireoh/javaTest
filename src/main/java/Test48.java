/*
案例：
声明一个三角形类Triangle，包含属性：a,b,c，表示三条边，包含几个方法：
boolean isRightTriangle()：判断是否是一个直角三角形
boolean isIsoscelesTriangle()：判断是否是一个等腰三角形
boolean isEquilateralTriangle()：判断是否是一个等边三角形
double getLength()：求周长
 */
public class Test48 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a=3;
        triangle.b=3;
        triangle.c=4;
        triangle.isRightTriangle();
        triangle.isEquilateralTriangle();
        triangle.isIsoscelesTriangle();
        triangle.getLength();
    }
}

class Triangle{
    int a;
    int b;
    int c;

    void isRightTriangle(){
        if (a > 0 && b > 0 && c > 0) {
            // 判断是否是三角形
            if (a + b > c && a + c > b && b + c > a) {
                if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                    System.out.println("直角三角形");
                }else {
                    System.out.println("不是直角三角形");
                }
            }
        }
    }

    void isIsoscelesTriangle(){
        if (a > 0 && b > 0 && c > 0) {
            // 判断是否是三角形
            if (a + b > c && a + c > b && b + c > a) {
                if(a==b || a==c || b==c){
                    System.out.println("等腰三角形");
                }else {
                    System.out.println("不是等腰三角形");
                }
            }
        }

    }

    void isEquilateralTriangle(){
        if (a > 0 && b > 0 && c > 0) {
            // 判断是否是三角形
            if (a + b > c && a + c > b && b + c > a) {
                if(a==b&&a==c){
                    System.out.println("等边三角形");
                }else {
                    System.out.println("不是等边三角形");
                }
            }
        }

    }

    void getLength(){
        System.out.println("周长是:"+(a+b+c));
    }

}
