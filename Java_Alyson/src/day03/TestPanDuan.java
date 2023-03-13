package day03;

import java.util.Scanner;

/*1.数组查找操作：
        定义一个长度为10 的一维字符串数组，
        在每一个元素存放一个单词；然后运行时从命令行输入一个单词，
        程序判断数组是否包含有这个单词，包含  这个单词就打印出“Yes”，不包含就打印出“No”。*/
public class TestPanDuan {
    public static void main(String[] args) {
        String[] arr = {"java", "python", "mysql", "hadoop"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个单词：");
        String word = sc.next();
        for (int i = 0; i < arr.length; i++) {
            if (word.equals(arr[i])) {
                System.out.println("Yes");
                break;
            } else {
                System.out.println("No");
                break;
            }
        }


    }
}
