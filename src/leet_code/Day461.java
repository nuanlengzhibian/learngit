package leet_code;

public class Day461 {
    public static void main(String[] args) {
        System.out.println(Day461.hammingDistance(1, 4));
    }
    public static int hammingDistance(int x, int y) {
        int res = 0;
        //int flag = 1073741824;
        int flag =(int)Math.pow(2,30);
        for (int count = x^y;flag!=0;){
            if (count/flag==1){
                res++;
                count=count%flag;
            }
            flag = flag/2;
        }
        return res;
    }
}
