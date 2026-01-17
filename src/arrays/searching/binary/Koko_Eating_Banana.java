package arrays.searching.binary;

public class Koko_Eating_Banana {
    public static long totalHrs(int[] arr, int value){
        long total=0;
        for(int x: arr){
            total+=(x + value -1)/value;  // OR  total+=ceil(x/value);
        }
        return total;
    }
    public static int minEatingSpeed(int[] arr, int h) {
        int max=Integer.MIN_VALUE;
        for(int x: arr){
            max=Math.max(max, x);
        }
        int low= 1, high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(totalHrs(arr, mid)<=h){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
    static void main(String[] args) {
        int[] arr={3,6,7,11};
        System.out.println(minEatingSpeed(arr, 8));
    }
}
