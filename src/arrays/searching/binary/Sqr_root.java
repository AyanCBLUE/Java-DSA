package arrays.searching.binary;

public class Sqr_root {
    static void main(String[] args) {
    int ans = squareRoot(25);
        System.out.println(ans);
    }
    static int squareRoot(int x){
        if(x<1) return x;
        int low=1, high=x;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid==x/mid) return mid;
            if(mid>x/mid) high=mid-1;
            else low=mid+1;
        }
        return high;
    }
}
