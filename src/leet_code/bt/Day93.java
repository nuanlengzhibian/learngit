package leet_code.bt;

import java.util.ArrayList;
import java.util.List;

public class Day93 {
    public static void main(String[] args) {
        Day93.restoreIpAddresses("25525511135");
    }
    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder list = new StringBuilder();
        backtrack1(res,list,s);
        return res;
    }
    public static void backtrack1(List<String> res,StringBuilder list,String s){
        int count = 0;
        if (list.length() == s.length()+3){
            res.add(list.toString());
            count++;
            System.out.println(count);
            return;
        }
        for (int i = 0;i < s.length();i++){
            list.append(s.charAt(i));
            if (list.toString().compareTo("0") >= 0 &&  list.toString().compareTo("255") <= 0 ){
                list.append(".");
                backtrack1(res,list,s);
                list.delete(list.length()-1,list.length());
            }
        }

    }
}
