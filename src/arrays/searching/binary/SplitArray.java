package arrays.searching.binary;

public class SplitArray {
    public static int splitSum(int[] arr, int value){
        int n=arr.length, countSplit=1, sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]<=value){
                sum+=arr[i];
            }
            else {
                countSplit++;
                sum=arr[i];
            }
        }
        return countSplit;
    }
    public static int splitArray(int[] nums, int k) {
        int max=0, sum=0;
        int n =nums.length;
        for(int num:nums){
            max=Math.max(max,num);
            sum+=num;
        }
        int high=sum, low=max;
        while(low<=high){
            int mid =low+(high-low)/2;

            if(splitSum(nums, mid)>k){

                low=mid+1;
            }
            else high=mid-1;
        }
        return low;
    }

    static void main(String[] args) {
        int[] arr= {7,2,5,10,8};
        int k=2;
        System.out.println(splitArray(arr, k));
    }
}
