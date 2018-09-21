package divisiblesumpairs;

public class Solution {
    static int divisibleSumPairs(int n, int k, int[] ar) {
       int sumPair = 0;
       int sumTmp;
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i+1; j < ar.length; j++) {
                sumTmp = ar[i]+ar[j];
                if(sumTmp%k == 0){
                    sumPair++;
                }
            }
        }
        return sumPair;
    }
}
//    static int divisibleSumPairs(int n, int k, int[] arr) {
//        int pairCount = 0;
//
//        // create an array with length equal to all reminders
//        // available to k (0 to k-1 reminders)
//        int[] remainderCountList = new int[k];
//
//        for (int i = 0; i < arr.length; i++) {
//            int remainder = arr[i] % k;
//            remainderCountList[remainder]++;
//        }
//
//        // Now that the remainders have been counted, all that
//        // produced a remainder of 0, can only be paired
//        // between themselves, so, if say, there were 4
//        // numbers, we can make up to six pairs
//        // i.e. (0,1) (0,2) (0,3), (1,2), (1,3), (2,3)
//        int exactCount = remainderCountList[0];
//        // all elements against a subset of one less of itself
//        // and only half the pairs can be used
//        pairCount += (exactCount * (exactCount-1)) / 2;
//
//        // Now, for all other remainders, pairs are of those
//        // that are complementing remainders
//        // i.e. if K = 5, remainders would be 0, 1, 2, 3, 4
//        // we know that 0 has already been accounted for
//        // so, next pairs are all of those in 1 with 4 and
//        // all those in 2 with 3
//        // So we only need to iterate through half of the
//        // remaining remainders, and make sure that we don't
//        // use a reaminder against itself for this calculation
//        for (int i = 1; i <= k/2 && i != k-i; i++) {
//            pairCount += remainderCountList[i] * remainderCountList[k-i];
//        }
//
//        // Finally, there is one more case to consider, if K
//        // yields an even number of remainders, the loop above
//        // would have skipped the exact middle remainder.
//        // i.e. for k = 4, remainders = 0, 1, 2, 3
//        //   0 has been accounted for
//        //   1 and 3 were paired up
//        //   2 is missing
//        // This last remainder behaves like the 0 remainder,
//        // so, we need to pair the numbers against themselves
//        if (k % 2 == 0) {
//            int halfCount = remainderCountList[k/2];
//            pairCount += (halfCount * (halfCount-1)) / 2;
//        }
//
//        return pairCount;
//    }