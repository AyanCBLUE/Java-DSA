package arrays.searching.linear;

public class LinearSearch2D {
    static boolean linearSearch(int[][] nums, int target){
        if(nums.length==0) return false;
        for (int[] num : nums) {
            for (int inNum : num){
                if(inNum==target) return true;
            }
        }
        return false;
    }
    static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(linearSearch(nums,123));
    }
}
