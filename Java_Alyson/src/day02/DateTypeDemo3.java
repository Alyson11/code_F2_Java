package day02;

/*
    130的二进制:00000000 00000000 00000000 10000010
        补码：00000000 00000000 00000000 10000010
        进行截取：10000010

        补码：  1           0000010
        已知补码求原码：
        反码：  1           0000001
        原码：  1           1111110
        ------------------------------------
        1111110 => 64+32+16+8+4+2 = 126
        -126

*/


public class DateTypeDemo3 {
    public static void main(String[] args) {
        byte b = (byte)(130);
        System.out.println(b);  // -126
    }
}
