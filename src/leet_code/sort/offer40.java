package leet_code.sort;

import java.util.Arrays;
import java.util.Random;

public class offer40 {
    static Random random = new Random();
    public static void main(String[] args) {
        int[] a = offer40.getLeastNumbers(new int[]{3,2,1},2);
        for (int i : a) {
            System.out.println(i);
        }
    }
    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        for (int i = 0;i<k;i++){
            res[i] = quickSelect(arr, 0, arr.length - 1, i);
        }
        return res;
    }
    public static int quickSelect(int[] a, int l, int r, int index) {
        int q = randomPartition(a, l, r);
        if (q == index) {
            return a[q];
        } else {
            return q < index ? quickSelect(a, q + 1, r, index) : quickSelect(a, l, q - 1, index);
        }
    }

    public static int randomPartition(int[] a, int l, int r) {
        int i = random.nextInt(r - l + 1) + l;
        swap(a, i, r);
        return partition(a, l, r);
    }

    public static int partition(int[] a, int l, int r) {
        int x = a[r], i = l - 1;
        for (int j = l; j < r; ++j) {
            if (a[j] <= x) {
                swap(a, ++i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
