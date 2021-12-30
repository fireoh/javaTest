import java.util.Scanner;

/*
案列:自定义商品价格 打折力度
 */
public class Test23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品总价:");
        double sale = scanner.nextDouble();
        System.out.println("请输入折扣力度");
        double discount = scanner.nextDouble();
        System.out.println("总价:"+sale+"\n折扣力度:"+discount+"折"+"\n折后价:"+sale*discount);
    }
}
