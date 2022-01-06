import java.util.Scanner;

/*
需求：保存全班的每个组的成绩，并对成绩做统计
从键盘输入一共有几组
从键盘输入每一组分别有多少人
从键盘输入每一个同学的成绩
 */
public class Test45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一共几组人");
        int group = scanner.nextInt();
        double[][] student = new double[group][];
        for (int i = 0; i < student.length; i++) {
            System.out.println("请输入第"+(i+1)+"组人数");
            int people = scanner.nextInt();
            student[i] = new double[people];
        }

        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                System.out.println("请输入第"+(i+1)+"组第"+(j+1)+"个学生的成绩");
                double score = scanner.nextDouble();
                student[i][j] = score;
            }
        }

        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                System.out.println("第"+(i+1)+"组第"+(j+1)+"个学生的成绩是"+student[i][j]);
            }
        }
    }
}
