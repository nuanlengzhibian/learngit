package leet_code;

public class Day645 {
    public static void main(String[] args) {
        int[] a =Day645.findErrorNums(new int[]{1, 2, 3, 2});
        for (int i : a) {
            System.out.println(i);
        }
    }
    public static int[] findErrorNums(int[] nums) {
        int[] counter=new int[nums.length+1];
        int[] res = new int[2];
        for (int i : nums) {
            counter[i]++;
        }
        for (int i = 1;i <=nums.length;i++){
            if (counter[i]==0)
                res[1]=i;
            else if (counter[i]==2)
                res[0]=i;
        }

        return res;
    }
}
