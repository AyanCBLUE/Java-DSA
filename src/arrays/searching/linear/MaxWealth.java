package arrays.searching.linear;

public class MaxWealth {
    public static void main(String[] args){
        int [][] amount = {{1,6},{2,10},{10,20}};
        System.out.println(maximumWealth(amount));
    }
    static int maximumWealth(int[][] amount){
        int ans =Integer.MIN_VALUE;
        for (int[] ints : amount) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
