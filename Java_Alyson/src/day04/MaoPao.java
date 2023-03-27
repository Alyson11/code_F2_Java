package day04;

public class MaoPao{
    public static void main(String[] args){
        int[] array = {23,2,45,6,43,2,1};
        System.out.println("排序之前：");
        printArray(array);
        System.out.println("排序之后：");
        int[] newArray = BubbingSort(array);
        printArray(newArray);
    }

    //排序
    public static int[] BubbingSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }

    //输出
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                System.out.print("[" + array[i] + ",");
            } else if(i == array.length - 1){
                System.out.println(array[i] + "]");
            } else{
                System.out.print(array[i] + ",");
            }
        }
    }

}
