import java.util.Scanner;

/*
从键盘输入本组学员的人数，和本组学员的成绩，用数组存储成绩，然后实现从高到低排序
 */
public class Test40 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入本组学员人数");
        int people = scanner.nextInt();
        int[] person = new int[people];
        for (int i = 0; i < person.length; i++) {
            System.out.println("请输入第"+(i+1)+"的分数");
            person[i]=scanner.nextInt();
        }
        for(int i=1; i<person.length; i++){
            for(int j=0; j<person.length-i; j++){
                if(person[j] < person[j+1]){
                    int temp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = temp;
                }
            }
        }

        for (int j : person) {
            System.out.print(j + " ");
        }
    }
}
