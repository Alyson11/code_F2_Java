package day03;

/*
    数组元素逆序 (就是把元素对调)
    1,2,3,4,5  ---> 5,4,3,2,1
 */
public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};

        for(int i=0;i<arr.length/2;i++){
            int tmp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=tmp;
        }
        System.out.println(arr[0]);
    }
}