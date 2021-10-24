package leet_code;

import java.util.Arrays;

public class Day1310 {
    public static void main(String[] args) {
        int[] a =Day1310.xorQueries(new int[]{1,3,4,8},new int[][]{{0,1},{1,2},{0,3},{3,3}});
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] res = new int[queries.length];
        Arrays.fill(res,0);
        int k = 0;

        for (int i = 0;i < queries.length;i++){
            for (int j = queries[i][0];j <= queries[i][1];j++){
                res[k] = res[k]^arr[j];
            }
            k++;
        }

        return res;
    }
}
