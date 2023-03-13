package day03;

/*
    while循环：
        格式语句：
        初始化语句
        while(判断语句){
            循环体
            控制语句
        }

    注意： for循环可以和while循环等价转换
*/

public class WhileDemo {
    public static void main(String[] args) {
        //在控制台中输出10行helloworld
//        for(int i=1;i<=10;i++){
//            System.out.println("helloworld");
//        }

        int i=1;
        while(i<=10){
            System.out.println("helloworld");
            i++;
        }
    }
}
