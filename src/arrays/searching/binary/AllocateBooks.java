package arrays.searching.binary;

public class AllocateBooks {
    static int allocation(int[] arr,int pages){
    int n=arr.length, countStd=1, sum=0;
    for(int i=0;i<n;i++){
        if(sum+arr[i]<=pages){
            sum+=arr[i];
        }
        else {
            countStd++;
            sum=arr[i];
        }
    }
    return countStd;
    }
    static int allocatBooks(int[] nums, int m){
        int max=Integer.MIN_VALUE, sum=0, n= nums.length;
        for(int num: nums){
            max=Math.max(max, num);
            sum+=num;
        }
        int low=max, high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(n>m) return -1;
            if(allocation(nums, mid)>m){
                low=mid+1;
            }
            else high=mid-1;
        }
        return low;
    }
    static void main(String[] args) {
        int[] arr={25, 46, 28, 49, 24};
        int m=4;
        System.out.println(allocatBooks(arr, m));
    }
}
