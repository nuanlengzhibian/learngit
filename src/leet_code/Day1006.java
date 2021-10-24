package leet_code;

public class Day1006 {
    public static void main(String[] args) {
        System.out.println(Day1006.clumsy(4));
    }
    public static int clumsy(int N) {
        int a = N % 4;
        int res = 0;
        if(N ==4){
            return 7;
        }else if (N == 3){
            return 6;
        }else if (N == 2){
            return 2;
        }else if (N == 1){
            return 1;
        }
        res = res + N*(N-1)/(N-2) + N-3;
        for (int i = N-4;i > a;i=i-4){
            res = res - i*(i-1)/(i-2) + i-3;

        }
        switch (a){
            case 0:
                break;
            case 1:
                res = res - 1;
                break;
            case 2:
                res = res - 2*1;
                break;
            case 3:
                res = res -3*2/1;
                break;
        }
        return res;
    }
    //还可以用递归的思想进行简化
}
