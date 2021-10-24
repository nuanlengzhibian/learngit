package leet_code;

public class Day1720 {
    public static void main(String[] args) {
        int [] b = Day1720.decode(new int[]{6,2,7,3}, 4);
        for (int i : b) {
            System.out.print(i+" ");
        }
    }
    public static int[] decode(int[] encoded, int first) {
        int[] a = new int[encoded.length+1];
        a[0] = first;
        for (int i = 1;i <= encoded.length;i++){
            a[i] = Math.abs(encoded[i-1]^a[i-1]);
        }
        return a;
    }
}
