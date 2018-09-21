package minmaxsum;

public class Solution {
    static void miniMaxSum(int[] arr) {
        int minIndex = 0, maxIndex = 0;
        int minValue = arr[minIndex];
        int maxvalue = arr[maxIndex];
        long minSum = 0, maxSum = 0;
        for (int i = 1; i < arr.length; i++) {
            if(maxvalue < arr[i]){
                maxvalue = arr[i];
                maxIndex = i;
            }
            if(minValue > arr[i]){
                minValue = arr[i];
                minIndex = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i != minIndex){
                maxSum += arr[i];
            }
            if(i != maxIndex){
                minSum += arr[i];
            }
        }
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        miniMaxSum(array);
    }

}
