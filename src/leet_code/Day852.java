package leet_code;

public class Day852 {
    public static void main(String[] args) {
        System.out.println(Day852.peakIndexInMountainArray(new int[]{3, 4, 5, 6,3,2}));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int k = 0;
        for (int i=1;i < arr.length;i++){
            if (arr[i]>arr[i-1])
                k = i;
            else
                break;
        }
        return k;
    }
}
