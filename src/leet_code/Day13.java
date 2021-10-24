package leet_code;

public class Day13 {
    public static void main(String[] args) {
        System.out.println(Day13.romanToInt("LVIII"));
    }
    public static int romanToInt(String s) {
        int[] values = new int[]{1000,500,100,50,10,5,1};
        char[] reps = new char[]{'M','D','C','L','X','V','I'};
        int res = 0;
        int count = 0;


        for (int i = 1;i <= s.length();i++){
            for (int j = 0;j < reps.length;j++){
                if (s.charAt(s.length() - i) == reps[j] && i == 1){
                    res = res + values[j];
                    count = j;
                }else if (s.charAt(s.length() - i) == reps[j] && i>1){
                    if (j > count)
                        res = res - values[j];
                    else {
                        res = res + values[j];
                        count = j;
                    }


                }

            }
        }
        return res;
    }
}
