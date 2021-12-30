/*
定义类Test6
定义main方法
定义一个int类型变量hours，赋值为89
定义一个int类型变量day，用来保存89小时中天数的结果
定义一个int类型变量hour，用来保存89小时中不够一天的剩余小时数的结果
输出结果
 */
public class Test16 {
    public static void main(String[] args) {
        int hours = 89;
        int day = hours/24;
        int hour = 89 - day*24;
        System.out.println(day+"天"+hour+"小时");
    }
}
