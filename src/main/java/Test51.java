/*
案例：
知识点：可变参数
在Count类中，声明如下方法：
public long sum(int... nums)：求0~n个整数的累加和，如果没有传参，就返回0
public int max(int a, int... others)：求1~n个整数中的最大值
public String concat(String... strings)：求0~n个字符串的拼接结果
public boolean isEven(int... nums)：
判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false
 */
public class Test51 {
    public static void main(String[] args) {
        Count count = new Count();
        System.out.println(count.sum(1,2,3,4,5,6,7));
        System.out.println(count.max(1,43,2,4,100,47,60));
        System.out.println(count.concat("a","b","c"));
        System.out.println(count.isEven(2,4,6,8));
    }
}


class Count{
    public long sum(int... num){
        long sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        return sum;
    }

    public int max(int a, int... others){
        int max = others[0];
        for (int i = 1; i < others.length; i++) {
            for (int j = 0; j < others.length-1; j++) {
                if(others[j]>others[j+1]){
                    max = others[j];
                }
            }
        }
        return max;
    }

    public String concat(String... strings){
        String word = "";
        for (int i = 0; i < strings.length; i++) {
            word = word+strings[i];
        }
        return word;
    }

    public boolean isEven(int... nums){
        boolean b1 = true;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                b1 = true;
            }else {
                b1 = false;
                break;
            }
        }
        return b1;
    }
}