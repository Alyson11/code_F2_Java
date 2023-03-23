package day12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) {
        //目标的文件可以不存在，如果不存在会自动创建
//        File file = new File("Java_Alyson/src/day12/b.txt");
//        FileOutputStream fos = new FileOutputStream(file);
//        System.out.println(fos);

        //FileOutputStream(String name)
        //默认是覆盖的形式写入
//        FileOutputStream fos = new FileOutputStream("Java_Alyson/src/day12/b.txt");

        FileOutputStream fos = null;
        try {
            // 实现追加
            fos = new FileOutputStream("Java_Alyson/src/day12/b.txt", true);

            //public void write(int b)
            //一次写一个字节
            fos.write(97);
            fos.write(98);
            fos.write(99);
            fos.write(98);
            fos.write(97);

            //public void write(byte[] b)
            //写一个字节数组
            String s = "Jackson";
            fos.write(s.getBytes());

            //public void write(byte[] b,int index,int len)
            //写字节数组的一部分
            byte[] bytes = {11, 22, 33, 44, 55};
            fos.write(bytes, 1, 2);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
