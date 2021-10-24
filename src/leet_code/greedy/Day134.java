package leet_code.greedy;

public class Day134 {
    public static void main(String[] args) {
        System.out.println(Day134.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
//        int[] sum = new int[gas.length];
//        for (int i= 0;i < gas.length;i++)
//            sum[i] = gas[i] - cost[i];
//        for (int i = 0;i < gas.length;i++){
//            if (sum[i] >= 0){
//                int temp = 0;
//                for (int j = i;j< gas.length;){
//                    temp += sum[j];
//                    if (temp < 0)
//                        break;
//                    if (j == gas.length-1)
//                        j = -1;
//                    j++;
//                    if (j == i)
//                        return i;
//                }
//
//            }
//        }
//        return -1;
        int len = gas.length;
        int spare = 0;
        int minSpare = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < len; i++) {
            spare += gas[i] - cost[i];
            if (spare < minSpare) {
                minSpare = spare;
                minIndex = i;
            }
        }
        //如果解答唯一，按理来说所有的最低点都应该有gas[minIndex] < cost[minIndex]
        return spare < 0 ? -1 : gas[minIndex] > cost[minIndex] ? minIndex : (minIndex + 1) % len;
    }
}
