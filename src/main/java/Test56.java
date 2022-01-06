/*
案例：
1、声明员工类、程序员类、设计师类、架构师类，
员工类属性：编号、姓名、年龄、薪资
程序员类属性：编程语言，默认都是"java"
设计师类属性：奖金
架构师类属性：持有股票数量
要求：属性私有化，无参有参构造，get/set，getInfo方法（考虑重写）

2、声明Test16类，并在main中创建每一个类的对象，并为属性赋值，
并调用它们的getInfo()显示信息

 */
public class Test56 {
    public static void main(String[] args) {
        new Employee02(1,"小王",28,2000).getInfo();
        new Programmer("java").getInfo();
        new Designer(20000).getInfo();
        new Architect(5000).getInfo();
    }
}

class Employee02{
    private int id;
    private String name;
    private int age;
    private double salary;
    Employee02(int id, String name, int age, double salary){
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

    public void getInfo(){
        System.out.println("编号是:"+id+"\t姓名是:"+name+"\t年龄是:"+age+"\t薪资是:"+salary);
    }
}


class Programmer{
    private String language = "java";

    Programmer(String language){
        this.language=language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void getInfo(){
        System.out.println("编程语言是:"+language);
    }
}

class Designer{
    private double bonus;

    Designer(double bonus){
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void getInfo(){
        System.out.println("奖金是:"+bonus);
    }
}

class Architect{
    private int stockNum;

    Architect(int stockNum){
        this.stockNum=stockNum;
    }

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }
    public void getInfo(){
        System.out.println("股票数量是:"+stockNum);
    }
}