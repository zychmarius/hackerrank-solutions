package pickingnumber;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pickingNumbers function below.
    static int pickingNumbers(int[] a) {
        Arrays.sort(a);
        int actualnumber;
        actualnumber = a[0];
        int lengthOfNumberFirst = 1;
        int lengthOfNumberSecond = 0;
        int maxLength = 0;
        int index = 1;


        for (int i = index; i < a.length; i++) {
            if (actualnumber == a[i]){
                lengthOfNumberFirst++;
                if (maxLength < lengthOfNumberFirst + lengthOfNumberSecond) {
                    maxLength = lengthOfNumberFirst + lengthOfNumberSecond;
                }
            }else if(actualnumber + 1 == a[i]){
                lengthOfNumberSecond++;
                if (maxLength < lengthOfNumberFirst + lengthOfNumberSecond) {
                    maxLength = lengthOfNumberFirst + lengthOfNumberSecond;
                }
            }else if(a[i -1] == a[i]-1){
                lengthOfNumberFirst = lengthOfNumberSecond;
                actualnumber = a[i] - 1;
                lengthOfNumberSecond = 1;
                if (maxLength < lengthOfNumberFirst + lengthOfNumberSecond) {
                    maxLength = lengthOfNumberFirst + lengthOfNumberSecond;
                }
            }else if(Math.abs(a[i] - (a[i-1])) > 1){
                actualnumber = a[i];
                lengthOfNumberFirst = 1;
                lengthOfNumberSecond = 0;
                if (maxLength < lengthOfNumberFirst + lengthOfNumberSecond) {
                    maxLength = lengthOfNumberFirst + lengthOfNumberSecond;
                }
            }
        }

        return maxLength;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
