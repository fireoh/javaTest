/*/
定义类 Test28，定义 main方法
main方法中,定义int类型变量 a为1
使用while循环,判断a<=5,进入循环.
while循环内部,使用for循环,初始化int类型变量b为1,当b<=5时进入循环, 步进表达式b++
for循环内,不换行输出i并拼接" "
for循环外,输出换行.
for循环外,a自增.

 */
public class Test28 {
    public static void main(String[] args) {
        int a = 1;
        while(a<=5){
            for (int b = 1; b <=5 ; b++) {
                System.out.print(b);
                System.out.print(" ");
            }
            System.out.println();
            a++;
        }
    }
}
