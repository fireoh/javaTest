import java.util.Random;

/*
模拟大乐透号码：
一组大乐透号码由10个1-99之间的数字组成
打印大乐透号码信息
使用数组保存录入或随机产生的号码
如果使用键盘输入，需要用到java.util.Scanner
如果使用随机产生，可以使用Math.random()或java.util.Random的nextInt(bounds)
 */
public class Test33 {
    public static void main(String[] args) {
        int[] number = new int[10];
        java.util.Random rand = new java.util.Random();
        for(int i=0;i<number.length;i++){
            number[i]=rand.nextInt(99)+1;
        }
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
