/*
模拟接待员接待用户，根据用户id，给用户分组。
定义用户类：
属性：用户类型，用户id
提供基本的构造方法和get方法，set方法
定义接口Filter：
提供抽象方法filterUser（User u）
定义实现类V1Filter，实现抽象方法，将用户设置为v1
定义实现类V2Filter，实现抽象方法，将用户设置为v2
定义实现类AFilter，实现抽象方法，将用户设置为A
定义接待员类Receptionist：
属性：接口Filter
提供基本的构造方法和get方法，set方法
成员方法：接待用户方法，设置用户类型。
测试类：
初始化15个User对象，id为1-15。
创建三个接待员对象。
第一个接待员，设置接待规则，将1-5号用户类型设置为v1。
第二个接待员，设置接待规则，将6-10号用户类型设置为v2。
第三个接待员，设置接待规则，将11-15号用户类型设置为A。
遍历数组，给用户分区。

 */
public class Test68 {
    public static void main(String[] args) {
        User[] users = new User[15];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(i+1, null);
        }
        V1Filter v1F = new V1Filter();
        V2Filter v2F = new V2Filter();
        AFilter aF = new AFilter();
        Receptionist r1 = new Receptionist(v1F);
        for (int i = 0; i < 5; i++) {
            r1.setType(users[i]);
        }
        Receptionist r2 = new Receptionist(v2F);
        for (int i = 5; i < 10; i++) {
            r2.setType(users[i]);
        }
        Receptionist r3 = new Receptionist(aF);
        for (int i = 10; i < 15; i++) {
            r3.setType(users[i]);
        }
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }
}

interface Filter{
    void filterUser(User u);
}

class User{
    private int id;
    private String type;
    User(int id, String type){
        this.id=id;
        this.type=type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "id=" + id +", type=" + type ;
    }
}

class V1Filter implements Filter{
    @Override
    public void filterUser(User u) {
        u.setType("v1");
    }
}

class V2Filter implements Filter{
    @Override
    public void filterUser(User u) {
        u.setType("v2");
    }
}

class AFilter implements Filter{
    @Override
    public void filterUser(User u) {
        u.setType("A");
    }
}

class Receptionist{
    private Filter filter;
    Receptionist(Filter filter){
        this.filter=filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
    public void setType(User user){
        filter.filterUser(user);
    }
    public void getInfo(User user){
        user.toString();
    }
}