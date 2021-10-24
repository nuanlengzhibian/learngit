package leet_code;

public class Day17_21 {
    public static void main(String[] args) {
        System.out.println(Day17_21.trap(new int[]{4,2,0,3,2,5}));
    }
    public static int trap(int[] height) {
        int[] water = new int[height.length];
        int res = 0;
        int l_max ;
        int r_max ;
        for (int i = 1;i < height.length-1;i++){
            l_max = 0;
            r_max = 0;
            for (int j = 0;j<i;j++){
                l_max = Math.max(l_max,height[j]);
            }
            for (int k = i+1;k < height.length;k++){
                r_max = Math.max(r_max,height[k]);
            }
            water[i] = Math.max((Math.min(l_max,r_max)-height[i]),0);

        }

        for (int i = 0;i < height.length;i++){
            res = res + water[i];
        }
        return res;
    }
}
