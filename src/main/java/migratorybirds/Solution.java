package migratorybirds;

public class Solution {
    static int migratoryBirds(int n, int[] ar) {
        int[] valueOfBirds= new int[5];
        int maxValue = 0;
        int maxIndex = 1;
        for (int element:ar) {
            valueOfBirds[element-1]++;
        }
        for (int i = 0; i < valueOfBirds.length; i++) {
            if (maxValue < valueOfBirds[i]){
                maxIndex = i+1;
                maxValue =valueOfBirds[i];
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        migratoryBirds(6,new int[]{1,4,4,4,5,3});
    }
}
