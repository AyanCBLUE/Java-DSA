package arrays.searching.binary;

public class MedianInRowWiseSorted {
        public static int countMissing(int[][] mat, int value){
            int total=0;
            for(int i=0; i<mat.length;i++){
                int low=0, high=mat[0].length-1;
                while(low<=high){
                    int mid = low+(high-low)/2;
                    if(mat[i][mid]<=value) low=mid+1;
                    else high=mid-1;
                }
                total+=low;
            }
            return total;
        }
        public static int findMedian(int[][] mat) {
            int median = (mat.length*mat[0].length)/2;
            int low=Integer.MIN_VALUE, high=Integer.MIN_VALUE;
            for (int i=0; i<mat.length;i++){
                low=Math.max(low, mat[i][0]);
                high=Math.max(high, mat[i][mat[0].length-1]);
            }
            while (low<=high){
                int mid = low+(high-low)/2;
                int missing = countMissing(mat, mid);
                if(missing<=median) low=mid+1;
                else high=mid-1;
            }
            return low;
        }
}
