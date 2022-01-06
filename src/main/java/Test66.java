/*
模拟玩家选择角色。
定义接口FightAble：
抽象方法：specialFight。
默认方法：commonFight,方法中打印"普通打击"。
定义战士类：
实现FightAble接口,重写方法中打印"武器攻击"。
定义法师类Mage：
实现FightAble接口,重写方法中打印"法术攻击"。
定义玩家类Player：
静态方法：FightAble select(String str)，根据指令选择角色。
法力角色，选择法师。
武力角色，选择战士。
 */
public class Test66 {
    public static void main(String[] args) {
        FightAble f1 = Player.select("法力角色");
        f1.specialFight();
        f1.commonFight();

    }
}
interface FightAble{
    void specialFight();
    default void commonFight(){
        System.out.println("普通攻击");
    }
}

class Warrior implements FightAble{
    @Override
    public void specialFight() {

    }

    @Override
    public void commonFight() {
        System.out.println("武器攻击");
    }
}

class Mage implements FightAble{
    @Override
    public void specialFight() {

    }

    @Override
    public void commonFight() {
        System.out.println("法术攻击");
    }
}

class Player{
    public static FightAble select(String str){
        if("法力角色".equals(str)){
            return new Mage();
        }else if("武力角色".equals(str)){
            return new Warrior();
        }
        return null;
    }
}