package leet_code;

public class Day633 {
    public static void main(String[] args) {
        System.out.println(Day633.judgeSquareSum(5));
    }
    public static boolean judgeSquareSum(int c) {
        //int max = 46341;
        //1.运行超时，需要进行优化
//        for (int i = 0;i < 46341;i++){
//            if (i*i >c)
//                return false;
//            for(int j = i;j < 46341;j++){
//                if (i*i +j*j == c)
//                    return true;
//                if (j*j >c)
//                    break;
//            }
//        }
//        return false;
        //2.利用双指针法
        int i = 0;
        int j = (int)Math.sqrt(c);
        int total = 0;
        while(i <= j){
            total = i*i +j*j;
            if(total > c)
                j--;
            else if (total < c)
                i++;
            else
                return true;
        }
        return false;

    }
}
