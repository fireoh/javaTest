/*
根据标准答案【ADBCD】，每题2分共10分，求出每名学生最终得分。
四名同学答案分别为：
小尚：【DCBAD】
小硅：【ADBCD】
小谷：【ADBCA】
小好：【ABCDD】
每答对一题，得2分，输出四名同学的最终得分。
 */
public class Test39 {
    public static void main(String[] args) {
        char[] shang = {'D', 'C', 'B', 'A', 'D'};
        char[] gui = {'A', 'D', 'B', 'C', 'D'};
        char[] gu = {'A', 'D', 'B', 'C', 'A'};
        char[] hao = {'A', 'B', 'C', 'D', 'D'};
        score(shang);
        score(gui);
        score(gu);
        score(hao);
    }
    public static void score ( char[] chars){
        int score = 0;
        char[] answer = {'A', 'D', 'B', 'C', 'D'};
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == answer[i]) {
                score += 20;
            }
        }
        System.out.println(score);
    }
}
