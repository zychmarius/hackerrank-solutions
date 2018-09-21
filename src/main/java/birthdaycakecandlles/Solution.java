package birthdaycakecandlles;

public class Solution {
    static int birthdayCakeCandles(int n, int[] ar) {
        int max = 0;
        int candles = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]>max){
                max = ar[i];
                candles = 0;
            }
            if(max == ar[i]){
                candles++;
            }
        }
        return candles;

    }

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 3};
        System.out.println(birthdayCakeCandles(4, array));
    }

}
