package day11;
/*
    创建功能
        public boolean createNewFile()
        public boolean mkdir()
        public boolean mkdirs()
    删除功能
        public boolean delete()
    重命名功能
        public boolean renameTo(File dest)
    判断功能
        public boolean isDirectory()
        public boolean isFile()
        public boolean exists()
        public boolean canRead()
        public boolean canWrite()
        public boolean isHidden()
    基本获取功能
        public String getAbsolutePath()
        public String getPath()
        public String getName()
        public long length()
        public long lastModified()
 */

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) throws Exception {
//    创建功能
//        public boolean createNewFile()  创建一个新文件
        File file = new File("Java_Alyson/src/day11/c" +
                ".txt");
//        System.out.println(file.createNewFile());

//        public boolean mkdir()  创建一个新文件夹
        File file1 = new File("Java_Alyson/src/day11/a");
        file1.mkdir();

//        public boolean mkdirs()  //可以创建多级目录
        File file2 = new File("Java_Alyson/src/day11/b/c/d");
        file2.mkdirs();

//    删除功能
//        public boolean delete() //如果要使用delete()删除目录的话，就必须保证该目录中没有其他文件或者文件夹
        File file3 = new File("Java_Alyson/src/day11/b/c/d");
        file3.delete();

//    重命名功能
//        public boolean renameTo(File dest)
        File file4 = new File("Java_Alyson/src/day11/c.txt");
        File file5 = new File("Java_Alyson/src/day11/e.txt");
        file4.renameTo(file5);

//    判断功能
//        public boolean isDirectory()
//        System.out.println(file5.isDirectory()); //测试此抽象路径名表示的文件是否为目录。
//        public boolean isFile()
//        System.out.println(file5.isFile()); //测试此抽象路径名表示的文件是否为普通文件。
//        public boolean exists() //测试此抽象路径名表示的文件或目录是否存在。
//        public boolean canRead()
//        public boolean canWrite()
//        public boolean isHidden()

//    基本获取功能
//        public String getAbsolutePath()
//        System.out.println(file5.getAbsoluteFile()); // 获取绝对路径
//        public String getPath()
//        System.out.println(file5.getPath()); //获取相对路径
//        public String getName()
//        public long length() //返回的文件内容字节数
//        public long lastModified() //文件上次修改的时间

    }
}
