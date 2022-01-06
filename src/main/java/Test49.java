/*
案例：
声明一个数学计算工具类MathTools，包含如下方法：
int add(int a, int b)：求a+b
int subtract(int a,int b)：求a-b
int mutiply(int a, int b)：求a*b
int divide(int a, int b)：求a/b
int remainder(int a, int b)：求a%b
int max(int a, int b)：求a和b中的最大值
int min(int a, int b)：求a和b中的最小值
boolean equals(int a, int b)：判断a和b是否相等
boolean isEven(int a)：判断a是否是偶数
boolean isPrimeNumer(int a)：判断a是否是素数
int round(double d)：返回d的四舍五入后的整数值
 */
public class Test49 {
    public static void main(String[] args) {
        MathTools mathTools = new MathTools();
        System.out.println(mathTools.add(1,2));
        System.out.println(mathTools.subtract(1,2));
        System.out.println(mathTools.multiply(1,2));
        System.out.println(mathTools.divide(1,2));
    }
}

class MathTools{
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
}