package day06;
/*
    假如我们在开发一个系统时需要对员工类进行设计，员工包含3个属性：姓名、工号以及工资。
    经理也是员工，除了含有员工的属性外，另为还有一个奖金属性。
    请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。
 */

class Clerk{
    private String name;
    private String id;
    private int wage;

    Clerk() {
    }

    Clerk(String name, String id, int wage) {
        this.name = name;
        this.id = id;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void work(){}
}

class Manager extends Clerk{
    private int salary;

    Manager() {}

    public Manager(String name, String id, int wage, int salary) {
        super(name, id, wage);
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("开会");
    }
}
public class DuoTaiTest2 {
    public static void main(String[] args) {
        //
        Clerk c = new Manager();
        c.work();
    }
}
