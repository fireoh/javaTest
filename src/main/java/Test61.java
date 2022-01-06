/*
案例：
1、声明员工类、程序员类、设计师类、架构师类，
员工类属性：编号、姓名、年龄、薪资
程序员类属性：编程语言，默认都是"java"
设计师类属性：奖金
架构师类属性：持有股票数量
要求：属性私有化，无参有参构造，get/set，getInfo方法（考虑重写）
2、声明测试类
（1）在main中有一些常量和一个二维数组
（2）创建一个员工数组
（3）根据以上数据，初始化员工数组
 */
public class Test61 {
    public static void main(String[] args) {
        final int EMPLOYEE = 10;//表示普通员工
        final int PROGRAMMER = 11;//表示程序员
        final int DESIGNER = 12;//表示设计师
        final int ARCHITECT = 13;//表示架构师
        String[][] EMPLOYEES = {
                {"10", "1", "段誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭靖", "25", "7100"},
                {"12", "12", "黄蓉", "27", "9600", "4800"}
        };
        Employee03[] all = new Employee03[EMPLOYEES.length];
        for (int i = 0; i < all.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            if(type == EMPLOYEE){
                all[i] = new Employee03(id, name, age, salary);
            }else if(type == PROGRAMMER){
                all[i] = new Programmer01(id, name, age, salary,"java");
            }else if(type == DESIGNER){
                double bonus = Integer.parseInt(EMPLOYEES[i][5]);
                all[i] = new Designer01(id, name, age, salary,"java", bonus);
            }else if(type == ARCHITECT){
                double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                int stock = Integer.parseInt(EMPLOYEES[i][6]);
                all[i] = new Architect01(id, name, age, salary,"java", bonus, stock);
            }
        }

        System.out.println("编号\t姓名\t年龄\t薪资\t语言\t奖金\t股票");
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].getInfo());
        }

    }
}


class Employee03{
    private int id;
    private String name;
    private int age;
    private double salary;
    Employee03(int id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfo(){
        return id + "\t" + name + "\t" + age + "\t" + salary;
    }
}


class Programmer01 extends Employee03{
    private String language = "java";

    Programmer01(int id, String name, int age, double salary,String language){
        super(id,name,age,salary);
        this.language=language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getInfo(){
        return super.getInfo() + "\t" + language;
    }
}

class Designer01 extends Programmer01{
    private double bonus;

    Designer01(int id, String name, int age, double salary,String language,double bonus){
        super(id,name,age,salary,language);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getInfo(){
        return super.getInfo()+ "\t" + bonus;
    }
}

class Architect01 extends Designer01{
    private int stockNum;

    Architect01(int id, String name, int age, double salary,String language,double bonus,int stockNum){
        super(id,name,age,salary,language,bonus);
        this.stockNum=stockNum;
    }

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }
    public String getInfo(){
        return super.getInfo() + "\t" + stockNum;
    }
}