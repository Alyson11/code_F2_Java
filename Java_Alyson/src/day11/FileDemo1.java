package day11;
/*
    File: 文件
    构造方法：
            public File(String pathname)
            public File(String parent,String child)
            public File(File parent,String child)

 */
import java.io.File;
public class FileDemo1 {
    public static void main(String[] args) {
//            public File(String pathname)
        // 将一个文件或者文件夹用一个File对象进行表示
        // 绝对路径（完整路径）：在windows中就代表的是带盘符的路径
        // 相对路径 ：以项目作为根目录存在
//        File file = new File("C:\\soft\\code_F2_Java\\Java_Alyson\\src\\day11\\a.txt");
//        File file1 = new File("Java_Alyson/src/day11/a.txt");
//        System.out.println(file.isFile());      // //判断是否是一个文件
//        System.out.println(file1.isFile());


//            public File(String parent,String child)
//        File file2 = new File("Java_Alyson/src/day11","a.txt");
//        System.out.println(file2.isFile());

//            public File(File parent,String child)
        File file = new File("Java_Alyson/src/day11");
        File file1 = new File(file,"a.txt");
        System.out.println(file1.isFile());


    }
}
