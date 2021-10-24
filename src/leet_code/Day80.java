package leet_code;


import java.util.ArrayList;
import java.util.Iterator;

public class Day80 {
    public static void main(String[] args) {
        Day80.removeDuplicates(new int[]{ 1, 1, 1, 2, 2, 3});
    }
    public static int removeDuplicates(int[] nums) {

        int count = 1;
        int i = 1;
        int k= 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(nums[0]);
        while (i < nums.length){
            arrayList.add(nums[i]);
            if (nums[i] == nums[i-1]){
                count++;
                while(count > 2){
                    arrayList.remove(arrayList.size()-1);
                    count--;
                }
            }else {
                count = 1;
            }
            i++;

        }
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            nums[k] = (int)iterator.next();
           // System.out.println(iterator.next());
            k++;
        }
        return arrayList.size();
    }
}
