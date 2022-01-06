import java.util.Scanner;

/*
二维数组 杨辉三角
第一行有 1 个元素, 第 n 行有 n 个元素
每一行的第一个元素和最后一个元素都是 1
从第三行开始, 对于非第一个元素和最后一个元素的元素.
yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]
 */
public class Test44 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入杨辉三角的行数:");
        int line = scanner.nextInt();
        int[][] yangHui = new int[line][];
        for(int i = 0;i<yangHui.length;i++){
            yangHui[i] = new int[i+1];
        }

        for(int i = 0;i<yangHui.length;i++){
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;
            for (int j = 1; j < yangHui[i].length-1; j++) {
                yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
            }
        }

        for(int i=0; i<yangHui.length; i++){
            for(int j=0; j<yangHui[i].length; j++){
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
