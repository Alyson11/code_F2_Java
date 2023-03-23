package day12;
/*
    字符流：
        字符输入流：Reader -- InputStreamReader -- FileReader
        字符输出流：Writer -- OutputStreamWriter -- FileWriter
 */

import java.io.*;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("Java_Alyson/src/day12/a.txt"));
        FileReader fr = new FileReader("Java_Alyson/src/day12/a.txt");
        // 创建字符输出流对象
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Java_Alyson/src/day12/a.txt"));
        FileWriter fw = new FileWriter("Java_Alyson/src/day12/d.txt");

        //一次读写一个字符
//        int i = 0;
//        while ((i = fr.read()) != -1) {
//            fw.write(i);
//            fw.flush();
//        }

        //一次读写一个字符数组
        char[] chars = new char[1024];
        int length = 0;
        while ((length = fr.read(chars)) != -1) {
            fw.write(chars,0,length);
            fw.flush();
        }

        fw.close();
        fr.close();
    }
}
