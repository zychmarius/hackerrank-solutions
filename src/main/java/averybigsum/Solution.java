package averybigsum;

public class Solution {
    public static long simpleArraySum(long[] ar) {
        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        long[] testInt = {1000000001 , 1000000002 ,1000000003 ,1000000004 , 1000000005 , };
        System.out.println(simpleArraySum(testInt));

    }
}
