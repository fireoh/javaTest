import java.util.Scanner;

/*
案例：从键盘输入本组学员的人数，和本组学员的姓名，用数组存储姓名
，然后再从键盘输入一个姓名，查找它是否在之前的数组中，如果存在，就显示它的下标
 */
public class Test41 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入本组人数");
        int people = scanner.nextInt();
        String[] name = new String[people];
        for (int i = 1; i <= people; i++) {
            System.out.println("请输入第"+i+"个人的姓名");
            name[i-1]=scanner.next();
        }

        System.out.println("请输入你要查找的人:");
        String person = scanner.next();
        boolean b1 = false;
        for (int i = 0; i < name.length; i++) {
            if(person.equals(name[i])){
                System.out.println(i);
                b1=true;
                break;
            }
        }
        if(!b1){
            System.out.println("查无此人");
        }
    }
}
