import java.util.Scanner;

/*
输入生日判断星座
白羊:3.21-4.19
金牛:4.20-5.20
双子:5.21-6.21
巨蟹:6.22-7.22
狮子:7.23-8.22
处女:8.23-9.22
天秤:9.23-10.23
天蝎:10.24-11.22
射手:11.23-12.21
摩羯:12.22-1.19
水瓶:1.20-2.18
双鱼:2.19-3.20
 */
public class Test24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入日期");
        int day = scanner.nextInt();
        if(month==1&&day>=20||month==2&&day<=18){
            System.out.println("水瓶");
        }else if(month==2&&day>=19||month==3&&day<=20){
            System.out.println("双鱼");
        }else if(month==3&&day>=21||month==4&&day<=19){
            System.out.println("白羊");
        }else if(month==4&&day>=20||month==5&&day<=20){
            System.out.println("金牛");
        }else if(month==5&&day>=21||month==6&&day<=21){
            System.out.println("双子");
        }else if(month==6&&day>=22||month==7&&day<=22){
            System.out.println("巨蟹");
        }else if(month==7&&day>=23||month==8&&day<=22){
            System.out.println("狮子");
        }else if(month==8&&day>=23||month==9&&day<=22){
            System.out.println("处女");
        }else if(month==9&&day>=23||month==10&&day<=23){
            System.out.println("天秤");
        }else if(month==10&&day>=24||month==11&&day<=22){
            System.out.println("天蝎");
        }else if(month==11&&day>=23||month==12&&day<=21){
            System.out.println("射手");
        }else {
            System.out.println("摩羯");
        }
    }
}
