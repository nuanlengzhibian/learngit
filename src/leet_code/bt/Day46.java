package leet_code.bt;

import java.util.ArrayList;
import java.util.List;

public class Day46 {
    public static void main(String[] args) {
        Day46.permute(new int[]{1,2,3});
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(res, list, nums);
        return res;
    }

    public static void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums) {
        /*
        回溯算法
        def backtrack(路径，选择列表)：
            if 满足结束条件：
                result.add(路径);
                return;

            for 选择 in 选择列表：
                做选择;
                backtrack(路径，选择列表);
                撤销选择;

         */
        if(list.size() == nums.length) {
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int num : nums) {
            if(!list.contains(num)) {
                list.add(num);
                backtrack(res, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }
}
