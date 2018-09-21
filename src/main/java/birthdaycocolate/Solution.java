package birthdaycocolate;

public class Solution {
    static int solve(int n, int[] s, int d, int m){
        if(n<1 || n<m){
            return 0;
        }
        int sum = 0;
        int permutations = 0;
        for (int i = 0; i < m; i++) {
            sum += s[i];
        }
        if(sum == d){
            permutations++;
        }
        for (int i = 0; i < s.length - m; i++) {
            sum = sum - s[i] + s[i+m];
            if(sum == d){
                permutations++;
            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        System.out.println(solve(5, new int[]{1,2,1,3,2},3,2));
    }
}
