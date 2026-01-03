package arrays.searching;

public class LinearSearchString {
    static boolean linearSearch(String str, char ch){
        if(str.length()==0) return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch) return true;
        }
        return false;
    }
    static void main(String[] args) {
        String str = "AyanChatterjee";
        boolean result = linearSearch(str,'C');
        System.out.println(result);
    }
}
