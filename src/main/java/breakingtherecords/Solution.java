package breakingtherecords;

public class Solution {
    static int[] breakingRecords(int[] score) {
        int[] highLow = new int[2];
        if(score.length <2){
            return highLow;
        }
        int min = score[0];
        int max = score[0];
        int tmpScore;
        for (int i = 1; i < score.length ; i++) {
            tmpScore = score[i];
            if (min > tmpScore){
                min = tmpScore;
                highLow[1]++;
            }
            if(max < tmpScore){
                max = tmpScore;
                highLow[0]++;
            }
        }
        return highLow;

    }

    public static void main(String[] args) {
        int[] score = breakingRecords(new int[]{10,5,20,20,4,5,2,25,1});
        System.out.println(score[0] + " " + score[1]);
    }

}
