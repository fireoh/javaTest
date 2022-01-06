/*
案例：
声明员工类Employee，包含属性：编号、姓名、年龄、薪资，
声明Test01测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息
 */
public class Test46 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("001","小王", 20, 6000);
        Employee employee2 = new Employee("002","小张", 28, 8000);
        employee1.say();
        employee2.say();
    }
}


class Employee{
    private String serialNumber;
    private String name;
    private int age;
    private double salary;

    Employee(String serialNumber, String name, int age, double salary){
        this.serialNumber=serialNumber;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public void say(){
        System.out.println("编号是:"+serialNumber+" 姓名是:"+name+" 年龄是:"+age+" 薪水是:"+salary);
    }
}