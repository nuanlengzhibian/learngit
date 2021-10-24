package leet_code;

public class Day1734 {
    public static void main(String[] args) {
        int[] a= Day1734.decode(new int[]{3,1});
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    public static int[] decode(int[] encoded) {
        int n = encoded.length+1;
        int[] perm = new int[n];
        int num1 = 0;
        int num2 = 0;
        //1.先计算出1-N的所有的异或值
        for (int i = 1;i <= n;i++)
            num1 = num1^i;
        //2.再计算出从encoded[1]开始步长为2的所有值的异或，这样得到的就是除去第一个数的剩余所有数的异或值。
        for (int i = 1;i < encoded.length;i=i+2)
            num2 = num2^encoded[i];
        //3.再利用a^b^b=a的原理，计算出第一个数的值。
        perm[0] = num1^num2;
        for (int i = 1;i <n;i++){
            perm[i] = perm[i-1]^encoded[i-1];
        }

        return perm;
    }
}
