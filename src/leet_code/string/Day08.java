package leet_code.string;

public class Day08 {
    public static void main(String[] args) {
        System.out.println(Day08.myAtoi("-91283472332"));
    }
    public static int myAtoi(String s) {
        int flag = 0;
        long res = 0;
        int sign = 0;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' ' && sign==0)
                continue;
            if (s.charAt(i)=='+' && sign==0){
                sign = 1;
                continue;
            }
            if (s.charAt(i)=='-' && sign==0){
                flag = 1;
                sign = 1;
                continue;
            }
            if (s.charAt(i)>57 || s.charAt(i)<48)
                break;
            if (s.charAt(i)>=48 && s.charAt(i)<=57){
                res = res*10 + s.charAt(i)-48;
                if (res > Math.pow(2,31)-1){
                   if (flag == 0){
                       res = 2147483647;
                       return (int)res;
                   }
                   else{
                       res = -2147483648;
                       return (int)res;
                   }
                }
                sign = 1;
            }
        }
        res = flag == 0?res:-res;
        return (int)res;
    }
}
