package diagonaldifference;

public class Solution {
    static int diagonalDifference(int[][] a) {
        int sum1 = 0;
        int sum2 = 0;
        int difference = 0;
        for (int i = 0; i < a.length ; i++) {
            sum1 += a[i][i];
            sum2 += a[i][a.length - 1 -i];
        }
        difference = sum1 - sum2;
        if (difference < 0){
            difference *= -1;
        }
        return difference;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };
        System.out.println(diagonalDifference(array));
    }


}
