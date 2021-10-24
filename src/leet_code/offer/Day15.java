package leet_code.offer;

public class Day15 {
    public static void main(String[] args) {

    }
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1')
                count++;
        }
        return count;
    }
}
