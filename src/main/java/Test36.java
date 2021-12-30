/*
统计高于平均分的分数有多少个。
定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。
 */
public class Test36 {
    public static void main(String[] args) {
        int[] score = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int average = 0;
        int sum = 0;
        int times = 0;
        for (int i = 0; i < score.length; i++) {
            sum+=score[i];
        }
        average = sum/10;
        for (int i = 0; i < score.length; i++) {
            if(score[i]>average){
                times+=1;
            }
        }
        System.out.println(times);
    }
}
