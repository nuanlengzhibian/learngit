package leet_code;

public class Day74 {
    public static int count = 0;
    public static void main(String[] args) {

        System.out.println(Day74.searchMatrix(new int[][]{{1, 3}}, 3));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        //方法一
//        for (int m = 0;m <matrix.length;m++){
//            for (int n= 0;n < matrix[m].length;n++){
//                count++;
//                System.out.print(count);
//                System.out.println(matrix[m][n]);
//                if (matrix[m][n] == target){
//                    return true;
//                }
//            }
//        }
//        return false;
        //方法二
//        for (int m = 0;m <matrix.length;m++){
//            if (matrix[m][0]<=target && matrix[m][matrix[m].length-1]>=target){
//                for (int n= 0;n < matrix[m].length;n++){
//                    if (matrix[m][n] == target){
//                        return true;
//                    }
//                }
//            }
//            continue;
//        }
//        return false;

        //方法三：二分查找
        if(matrix.length == 1 && matrix[0].length == 1)return matrix[0][0] == target;
        for(int i = 0; i < matrix.length; i++){
            int left = 0;
            int rigth = matrix[0].length - 1;
            int mid = (left + rigth) / 2;
            while(left <= rigth){
                if(matrix[i][mid] < target){
                    left = mid + 1;
                    mid = (left + rigth) / 2;
                }else if(matrix[i][mid] > target){
                    rigth = mid - 1;
                    mid = (left + rigth) / 2;
                }else{
                    return true;
                }
            }
        }
        return false;

    }

}
