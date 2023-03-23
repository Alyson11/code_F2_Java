package day12;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
    字节流：
        输入流：InputStream -- FileInputStream -- BufferedInputStream
        输出流：OutputStream -- FileOutputStream -- BufferedOutputStream
 */

public class BufferedOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Java_Alyson/src/day12/a.txt", true));

        //一次写一个字节
        bos.write(97);
        bos.write(98);
        bos.write(99);
        bos.write(98);

        //一次写一个字节数组
        byte[] bytes = new byte[1024];
        String s = "Jackson";
        bos.write(s.getBytes());

        bos.close();
    }
}
