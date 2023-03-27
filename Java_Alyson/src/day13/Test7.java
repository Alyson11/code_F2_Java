package day13;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/*
    TCP协议编程代码：
        1:建立客户端的Socket服务,并明确要连接的服务器。
        2:如果连接建立成功,就表明,已经建立了数据传输的通道.
        就可以在该通道通过IO进行数据的读取和写入.该通道称为Socket流,Socket流中既有读取流,也有写入流.
        3:通过Socket对象的方法,可以获取这两个流
        4:通过流的对象可以对数据进行传输
        5:如果传输数据完毕,关闭资源

 */
public class Test7 {
    public static void main(String[] args) throws Exception {
        //创建客户端的Socket对象
        //Socket(String host, int port)
        //创建流套接字并将其连接到指定主机上的指定端口号。
        Socket socket = new Socket("192.168.6.80", 12345);

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要发送的数据：");
            String s = sc.nextLine();
            if ("886".equals(s)) {
                //关闭资源
                socket.close();
                break;
            } else {
                //3:通过Socket对象的方法,可以获取这两个流
                //获取通道中的输出流对象
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(s);
                bw.flush();


                //获取通道中的输入流对象，用于接收服务器端给客户端的反馈
                InputStream inputStream = socket.getInputStream();
                byte[] bytes = new byte[1024];
                int length = inputStream.read(bytes);
                String s2 = new String(bytes, 0, length);
                System.out.println("服务器端给出的反馈：" + s2);
            }

        }
    }
}
