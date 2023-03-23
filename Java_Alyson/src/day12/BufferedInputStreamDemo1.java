package day12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
    字节缓冲输入流
 */
public class BufferedInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Java_Alyson/src/day12/a.txt"));

        //一次读取一个字节
//        int i=0;
//        while ((i=bis.read())!=-1){
//            System.out.print((char) i);
//        }

        //一次读取一个字节数组
        byte[] bytes = new byte[1024];
        int lengrh=0;
        while((lengrh=bis.read(bytes))!=-1){
            String s = new String(bytes,0,lengrh);
            System.out.println(s);
        }



        bis.close();
    }
}
