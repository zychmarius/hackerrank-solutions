package cutthesticks;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {

        Arrays.sort(arr);
        Integer[] arrI = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrI[i] = arr[i];
        }
        List<Integer> list = new LinkedList<>(Arrays.asList(arrI));
        List<Integer> outputList = new ArrayList<>();
        int actualLength;
        int count = 0;
        while (list.size() != 0){
            outputList.add(list.size());
            actualLength = list.get(0);
            for (int element: list){
                if(element == actualLength){
                    count ++;
                }else {
                    break;
                }
            }
            for (int i = 0; i < count; i++) {
                list.remove(0);
            }
            count = 0;
        }

        int[] outputArray = new int[outputList.size()];
        int count2 = 0;
        for (int element: outputList){
            outputArray[count2]=element;
            count2++;
        }
    return outputArray;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
