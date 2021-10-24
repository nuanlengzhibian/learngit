package leet_code.search;

public class offer11 {
    public static void main(String[] args) {
        System.out.println(offer11.minArray(new int[]{3,3,1,3}));
    }
    public static int minArray(int[] numbers) {
        int left = 0,right = numbers.length - 1;
        int middle;
        int res = Integer.MAX_VALUE;
        while(left <= right){
            middle = left+(right-left)/2;
            if (numbers[middle] < numbers[right]){
                res = Math.min(res,numbers[middle]);
                right = middle;
            }
            else if (numbers[middle] > numbers[right]){
                res = Math.min(res,numbers[middle]);
                left = middle + 1;
            }else{
                //去重,去重的处理不太好想到
                res = Math.min(res,numbers[middle]);
                right--;
            }

        }
        return res;
    }
}