package day03;

/*    do while循环格式语句：
        初始化语句
        do{
            循环体
            控制语句
            }while(判断语句)
*/

public class DoWhileDemo {
    public static void main(String[] args) {
        //在控制台中输出10行helloworld

        int i=1;
        do{
            System.out.println("helloworld");
            i++;
        }while(i<=10);
    }
}
