/*
案例：
声明一个日期类MyDate，包含属性：年、月、日，并在MyDate类中声明几个方法：
boolean isLeapYear()：判断当前日期的是闰年吗？
void set(int y, int m, int d)：修改年，月，日为新日期
 */
public class Test47 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(2022,1,1);
        myDate.isLeapYear();
        myDate.set(2021,12,28);
    }
}


class MyDate{
    int year;
    int month;
    int day;

    MyDate(int year, int month, int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    void isLeapYear(){
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("闰年");
        }else {
            System.out.println("不是闰年");
        }

    }

    void set(int year, int month, int day){
        System.out.println("新日期为:"+year+"年"+month+"月"+day+"日");
    }
}
