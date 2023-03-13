package day03;

/*
        请在控制台输出数据1-10
        请在控制台输出数据10-1
        求出1-10之间数据之和
        求出1-100之间偶数和
        求出1-100之间奇数和
        求5的阶乘
*/

public class ForTest1 {
    public static void main(String[] args) {
//        int sum=0;
//        for(int i=1;i<=10;i++){
////            System.out.println(i);
//            sum+=i;
//        }
//        System.out.println(sum);
//
//        for(int j=10;j>0;j--){
//            System.out.println(j);
//        }

//        求出1-100之间偶数和
//        int ouShuSum = 0;
//        int jiShuSum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                ouShuSum += i;
//            } else {
//                jiShuSum += i;
//            }
//        }
//        System.out.println("偶数和是：" + ouShuSum);
//        System.out.println("奇数和是：" + jiShuSum);


//        求5的阶乘
//        int jieCheng = 1;
//        for (int i = 1; i <= 5; i++) {
//            jieCheng *= i;
//        }
//        System.out.println("5的阶乘是：" + jieCheng);

//        在控制台输出所有的”水仙花数”
//        统计”水仙花数”共有多少个
//        int count = 0;
//        for (int i = 100; i < 1000; i++) {
////            234
//            int baiWei = i / 100;
//            int shiWei = i % 100 / 10;
//            int geWei = i % 10;
//            if ((baiWei * baiWei * baiWei + shiWei * shiWei * shiWei + geWei * geWei * geWei) == i) {
//                System.out.println(i);
//                count++;
//            }
//        }
//        System.out.println("水仙花的个数是：" + count);

//        请在控制台输出满足如下条件的五位数
//        个位等于万位
//        十位等于千位
//        个位+十位+千位+万位=百位
//        for (int i = 10000; i <= 99999; i++) {
////            12345
//            int geWei = i % 10;
//            int shiWie = i % 100 / 10;
//            int baiWei = i % 1000 / 100;
//            int qianWei = i % 10000 / 1000;
//            int wanWei = i / 10000;
//            if(geWei == wanWei & shiWie == qianWei & geWei + shiWie + qianWei + wanWei == baiWei){
//                System.out.println(i);
//            }
//        }

//        请统计1-1000之间同时满足如下条件的数据有多少个：
//        对3整除余2
//        对5整除余3
//        对7整除余2
        int count=0;
        for(int i=1;i<=1000;i++){
            if(i%3==2 & i%5==3 & i%7==2){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);

    }

}
