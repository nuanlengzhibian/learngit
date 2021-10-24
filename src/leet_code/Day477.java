package leet_code;

public class Day477 {
    public static void main(String[] args) {
        System.out.println(Day477.totalHammingDistance(new int[]{4, 14, 2}));
    }
    public static int totalHammingDistance(int[] nums) {
        int res = 0,x,y;
        //int flag = 1073741824;

        for (int i=0;i< nums.length-1;i++)
            for (int j=i+1;j< nums.length;j++){
                x=nums[i];
                y=nums[j];
                int flag =(int)Math.pow(2,30);
                for (int count = x^y;flag!=0;){
                    if (count/flag==1){
                        res++;
                        count=count%flag;
                    }
                    flag = flag/2;
                }
            }
        return res;
    }
}
