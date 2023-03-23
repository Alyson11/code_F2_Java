package day11;
/*
    递归遍历目录下指定后缀名结尾的文件名称
 */
import java.io.File;
public class DiGuiDemo2 {
    public static void main(String[] args) {
        File file = new File("C:\\");
        getJPG(file);
    }

    public static void getJPG(File file){
        if(file!=null){
            if(file.isFile()){
                if(file.getName().endsWith(".png")){
                    System.out.println(file.getName());
                }
            }else{
                File[] files=file.listFiles();
                if(files!=null){
                    for (File file1 : files) {
                        getJPG(file1);
                    }
                }
            }
        }

    }
}
