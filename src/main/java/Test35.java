/*
统计字符
字符数组：{'a','l','f','m','f','o','b','b','s','n'}
统计每个字符出现的次数并打印到控制台。
 */
public class Test35 {
    public static void main(String[] args) {
        char[] string = {'a','l','f','m','f','o','b','b','s','n'};
        for (int i = 0; i < string.length; i++) {
            int num = 0;
            for (int j = 0; j < string.length; j++) {
                if(string[j]==string[i]){
                    num+=1;
                }
            }
            System.out.println(string[i]+"---"+num);
        }
    }
}
