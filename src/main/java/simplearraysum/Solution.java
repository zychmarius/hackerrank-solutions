package simplearraysum;

public class Solution {
    public static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] testInt = {1, 2, 3, 4, 5, 6};
        System.out.println(simpleArraySum(testInt));

    }
}
