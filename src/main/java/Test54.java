/*
知识点：对象数组
案例：
1、声明一个Employee员工类，
包含属性：编号(id)、姓名(name)、薪资(salary)、年龄(age)，此时属性不私有化
包含方法：
（1）void printInfo()：可以打印员工的详细信息
（2）void setInfo(int i, String n, double s, int a)：
可以同时给id,name,salary,age赋值

2、声明一个EmployeeManager类，包含如下方法：
（1）public void print(Emplyee[] all)：遍历打印员工数组中的每个员工的详细信息
（2）public void sort(Employee[] all)：将all员工数组按照年龄从高到低排序
（3）public void addSalary(Employee[] all, double increament)：将all员工数组的每一个员工的工资，增加increament

3、声明Test05测试类
（1）public static void main(String[] args)：
在main方法中，创建Employee[]数组，并创建5个员工对象放到数组中，并为员工对象的属性赋值
（2）创建EmployeeManager对象，
（3）调用print方法，显示员工信息
（4）调用sort方法对员工数组进行按照年龄排序，并调用print方法，显示员工信息
（5）调用addSalary方法给每一个员工加薪1000元，并调用print方法，显示员工信息
 */
public class Test54 {
    public static void main(String[] args) {
        Employee01 employee01 = new Employee01();
        Employee01 employee02 = new Employee01();
        Employee01 employee03 = new Employee01();
        employee01.setInfo(1,"小王",3000,28);
        employee02.setInfo(2,"小张",2000,26);
        employee03.setInfo(3,"小李",2500,30);
        Employee01[] employee01s = {employee01,employee02,employee03};
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.sort(employee01s);
        employeeManager.print(employee01s);
        employeeManager.addSalary(employee01s, 1500);
    }
}


class Employee01{
    int id;
    String name;
    double salary;
    int age;

    public void printInfo(){
        System.out.println("id是:"+id+"\t姓名是:"+name+"\t薪资是:"+salary+"\t年龄是:"+age);
    }

    public void setInfo(int id, String name, double salary, int age){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}


class EmployeeManager{
    public void print(Employee01[] all){
        for (int i = 0; i < all.length; i++) {
            all[i].printInfo();
        }
    }

    public void sort(Employee01[] all){
        Employee01 temp;
        for (int i = 1; i < all.length; i++) {
            for (int j = 0; j < all.length-1; j++) {
                if(all[j].age>all[j+1].age){
                    temp = all[j];
                    all[j]= all[j+1];
                    all[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < all.length; i++) {
            all[i].printInfo();
        }
    }

    public void addSalary(Employee01[] all, double increament){
        for (int i = 0; i < all.length; i++) {
            all[i].salary+=increament;
        }
        for (int i = 0; i < all.length; i++) {
            all[i].printInfo();
        }
    }
}