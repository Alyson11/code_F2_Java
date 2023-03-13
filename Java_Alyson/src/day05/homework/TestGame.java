package day05.homework;

/*
    3.某公司要开发新游戏，请用面向对象的思想，设计游戏中的蛇怪和蜈蚣精  设定
        1)蛇怪类:
        属性包括：怪物名字，生命值，攻击力
        方法包括：攻击，移动（曲线移动），补血（当生命值<10 时，可以补加 20 生命值）
        2)蜈蚣精类：
        属性包括：怪物名字，生命值，攻击力
        方法包括：攻击，移动（飞行移动）
        要求:
            1)分析蛇怪和蜈蚣精的公共成员，提取出父类—怪物类
            2)利用继承机制，实现蛇怪类和蜈蚣精类
            3)攻击方法，描述攻击状态。内容包括怪物名字，生命值，攻击力
            4)编写测试类，分别测试蛇怪和蜈蚣精的对象及相关方法
            定义名为 mon 的包存怪物类，蛇怪类，蜈蚣精类和测试类
*/

class Monster {
    // 公共属性
    private String name;
    private int livePoint;      // 生命值
    private int attackForce;        // 攻击力

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLivePoint() {
        return livePoint;
    }

    public void setLivePoint(int livePoint) {
        this.livePoint = livePoint;
    }

    public int getAttackForce() {
        return attackForce;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }

    Monster() {
        super();
    }

    Monster(String name, int livePoint, int attackForce) {
        super();
        this.name = name;
        this.livePoint = livePoint;
        this.attackForce = attackForce;
    }

    // 方法  攻击，移动
    public void move() {
        System.out.println("移动");
    }

    public void attack() {
        System.out.println("怪物" + name + "展开攻击");
        System.out.println("当前生命值是：" + livePoint);
        System.out.println("攻击力是：" + attackForce);
    }
}

class Basilisk extends Monster {     // 蛇怪类
    Basilisk() {
    }

    Basilisk(String name, int livePoint, int attackForce) {
        super(name, livePoint, attackForce);
    }

    // 重写移动方法
    @Override
    public void move() {
        System.out.println("我是蛇怪,我走S型路线");
    }

    public void enrichBlood() {      // 补血 当生命值<10 时，可以补加 20 生命值
        if (getLivePoint() < 10) {
            int livePoint = getLivePoint();
            setLivePoint(livePoint += 20);
            System.out.println("施展大蛇补血术。。。。。，当前的生命值是:" + getLivePoint());
        }
    }

}

class Scolopendra extends Monster {   // 蜈蚣精类
    // 构造方法
    Scolopendra() {
    }

    Scolopendra(String name, int livePoint, int attackForce) {
        super(name, livePoint, attackForce);
    }

    // 重写移动方法
    @Override
    public void move() {
        System.out.println("我是蜈蚣精，御风飞行");
    }
}

public class TestGame {
    public static void main(String[] args) {
        // 创建蛇怪对象
        Basilisk b = new Basilisk("蛇怪甲", 5, 20);
        b.attack();
        b.enrichBlood();
        b.move();
        System.out.println("=======================================");
        Scolopendra s = new Scolopendra("蜈蚣乙", 60, 15);
        s.attack();
        s.move();
    }
}
