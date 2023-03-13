package day04;

public class StudentDemo1 {
    public static void main(String[] args) {
        // 创建一个学生对象
        // 语句格式： 类名 对象名 = new 类名();
        Student Student1 = new Student();
        // 获取这个对象的成员变量
        // 语句格式： 对象名.成员对象名
        Student1.id = "100201";
        Student1.age = 18;
        Student1.name = "jackson";

        System.out.println(Student1.id);
        System.out.println(Student1.age);
        System.out.println(Student1.name);

        // 如何访问成员方法
        // 语句格式： 对象名.方法名
        Student1.eat();
        Student1.Study();
        Student1.playGame("王者荣耀");

    }
}
