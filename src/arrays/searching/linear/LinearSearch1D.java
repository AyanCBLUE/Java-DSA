package arrays.searching.linear;

public class LinearSearch1D {
    static int linearSearch(int[] nums, int target){
        if(nums.length==0) return -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
    static void main(String[] args) {
        int[] nums = {12,23,45,76,8901,2,34};
        int result = linearSearch(nums,2);
        System.out.println(result);
    }
}
