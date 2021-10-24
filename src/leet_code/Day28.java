package leet_code;

public class Day28 {
    public static void main(String[] args) {
        System.out.println(Day28.strStr("aaaaa", "bba"));
    }
    public static int strStr(String haystack, String needle) {
        //1.运行超时，但是跑的用例是对的
//        int res = 0;
//        if (haystack.length() == 0 && needle.length() == 0)
//            return 0;
//        for (int i = 0;i < haystack.length();i++){
//            int j = 0;
//            int count = 0;
//            int index = 0;
//            for (int k = i;k < haystack.length();k++){
//                if (j < needle.length() && haystack.charAt(k) == needle.charAt(j)){
//                    count++;
//                    j++;
//                }else {
//                    break;
//                }
//            }
//            if (count > res){
//                index = i;
//                res = count;
//            }
//            if (res == needle.length())
//                return index;
//        }
//        return -1;
        //2.直接调用Java内置的api
        return haystack.indexOf(needle);
    }
}
