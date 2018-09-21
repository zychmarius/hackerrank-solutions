package appleandorrange;

public class Solution {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int scoreApples = 0;
        int scoreOranges = 0;
        int distance;
        for (int i = 0; i < apples.length; i++) {
            distance = a + apples[i];
            if(distance >= s && distance <= t){
                scoreApples++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            distance = b + oranges[i];
            if(distance >= s && distance <= t){
                scoreOranges++;
            }
        }
        System.out.println(scoreApples + " " + scoreOranges);
    }

    public static void main(String[] args) {
        countApplesAndOranges(7,11,5,15,new int[]{-2,2,1, 50,0},new int[]{5,-6 , -22,0,-4,-8});
    }

}
