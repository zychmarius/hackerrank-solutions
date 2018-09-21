package magicsquareforming;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.awt.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Point[][] points = new Point[][]{{new Point(0,0), new Point(0,1), new Point(0,2)},
            {new Point(1,0), new Point(1,1), new Point(1,2)},
            {new Point(2,0), new Point(2,1), new Point(2,2)},
            {new Point(0,0), new Point(1,0), new Point(2,0)},
            {new Point(0,1), new Point(1,1), new Point(2,1)},
            {new Point(0,2), new Point(1,2), new Point(2,2)},
            {new Point(0,0), new Point(1,1), new Point(2,2)},
            {new Point(2,0), new Point(1,1), new Point(0,2)}};

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        boolean check = true;
        Set<Point> pointSet = new HashSet<>();
        int allSum = 0;
        int[] sum = magicSquareSum(s);
        boolean[] correctLines = correctLineNumber(s);
        boolean[] correctUsedNumber = correctNumber(sum, correctLines, s);
        int countCheckBoolean = 0;
        for(boolean isCorrect: correctUsedNumber){
            if(!isCorrect){
                countCheckBoolean++;
                if (countCheckBoolean == 9){
                    check = false;
                    break;
                }
            }else {
                check = true;
            }
        }

        List<Integer> notChengeLines = endsLine(sum, correctLines);
        int countLine = 0;

        while (check) {
            for (int i = countLine; i < correctLines.length; i++) {
                if (!correctLines[i]) {
                    countLine = i ;
                    break;
                }
                if (countLine == correctLines.length - 1) {
                    countLine = 0;
                }
            }
            int countPoint = 0;
            Point[] pointToChange = repeatedNumbersPoint(countLine, s);
            for (int i = countPoint; i < pointToChange.length; i++) {
                List<Integer> linesOfPoint = pointLines(pointToChange[i]);
                if (checkIfChenge(linesOfPoint, notChengeLines)) {
                    countPoint = i;
                    int diffSum = sum[countLine] - 15;
                    int pointNumber = s[(int) pointToChange[i].getX()][(int) pointToChange[i].getY()];
                    int pointNewNumber = pointNumber - diffSum;
                    if (!correctUsedNumber[pointNewNumber - 1]) {
                        s[(int) pointToChange[i].getX()][(int) pointToChange[i].getY()] = pointNewNumber;
                        allSum += Math.abs(diffSum);
                        break;
                    }
                }

            }
            sum = magicSquareSum(s);
            correctLines = correctLineNumber(s);
            correctUsedNumber = correctNumber(sum, correctLines, s);
            notChengeLines = endsLine(sum, correctLines);

            countCheckBoolean = 0;
            for(boolean isCorrect: correctUsedNumber){
                if(!isCorrect){
                    countCheckBoolean++;
                    if (countCheckBoolean == 9){
                        check = false;
                        break;
                    }
                }else {
                    check = true;
                }
            }
        }


    return allSum;



    }

    public static int[] magicSquareSum(int[][] square){
//        points = new Point[][]{{new Point(0,0), new Point(0,1), new Point(0,2)},
//                                {new Point(1,0), new Point(1,1), new Point(1,2)},
//                                {new Point(2,0), new Point(2,1), new Point(2,2)},
//                                {new Point(0,0), new Point(1,0), new Point(2,0)},
//                                {new Point(0,1), new Point(1,1), new Point(2,1)},
//                                {new Point(0,2), new Point(1,2), new Point(2,2)},
//                                {new Point(0,0), new Point(1,1), new Point(2,2)},
//                                {new Point(2,0), new Point(1,1), new Point(0,2)}};
        int[] sum = new int[8];
        Point[] pointsTrace;

        for (int i = 0; i < points.length; i++) {
            pointsTrace = points[i];
            for (int j = 0; j < points[i].length; j++) {
                sum[i] += square[(int) pointsTrace[j].getX()][(int) pointsTrace[j].getY()];
            }
        }
        return sum;
    }

    public static boolean[] correctLineNumber(int[][] square){
        boolean[] booleans = new boolean[8];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length -1 ; j++) {
                booleans[i] = square[i][j] != square[i][j+1];
                if (!booleans[i]){
                    break;
                }
                if (j == 0){
                    booleans[i] = square[i][j] != square[i][j+2];
                }
                if (!booleans[i]){
                    break;
                }
            }
        }
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length -1 ; j++) {
                booleans[i+3] = square[j][i] != square[j+1][i];

                if (!booleans[i+3]){
                    break;
                }
                if (j == 0){
                    booleans[i+3] = square[j][i] != square[j+2][i];
                }
                if (!booleans[i+3]){
                    break;
                }
            }
        }
        for (int i = 0,j =0; i < square.length -1; i++, j++) {
            booleans[6] = square[i][j] != square[i][j + 1];
            if (!booleans[6]){
                break;
            }

            if (j == 0){
                booleans[6] = square[i][j] != square[i][j+2];
            }
            if (!booleans[6]){
                break;
            }
        }

        for (int i = 0, k = 2; i < square.length - 1; i++, k--) {
            booleans[7] = square[i][k] != square[i][k - 1];

            if (!booleans[7]){
                break;
            }
            if (k == 2){
                booleans[7] = square[i][k] != square[i][k-2];
            }
            if (!booleans[7]){
                break;
            }
        }
        return booleans;
    }

    public static boolean[] correctNumber(int[] sum, boolean[] lines, int[][] square){
        Point[] pointsTrace;
        boolean[] correctNumb = new boolean[9];
        for (int i = 0; i < sum.length; i++) {
            if(sum[i] == 15 && lines[i]){
                pointsTrace = points[i];
                for (int j = 0; j < pointsTrace.length; j++) {
                    correctNumb[square[(int) pointsTrace[j].getX()][(int) pointsTrace[j].getY()]-1] = true;
                }
            }
        }
        return correctNumb;
    }

    public static List<Integer> endsLine(int[] sum, boolean[] lines){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < sum.length; i++) {
            if (sum[i] == 15 && lines[i]){
                list.add(i);
            }
        }
        return list;

    }

    public static boolean checkIfChenge(List<Integer> listOfLineOnPoint, List<Integer> list){

        for (int line: listOfLineOnPoint){
            if (list.contains(line)){
                return false;
            }
        }
        return true;
    }
    public static List<Integer> pointLines(Point point){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                if(points[i][j] == point){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
    public static Point[] repeatedNumbersPoint(int line, int[][] square){
        Set<Point> pointSet = new HashSet<>();

        for (int i = 0; i < points[line].length-1; i++) {
            if (square[(int)points[line][i].getX()][(int)points[line][i].getY()] == square[(int)points[line][i+1].getX()][(int)points[line][i+1].getY()]){
                   pointSet.add(points[line][i]);
                   pointSet.add(points[line][i+1]);
            }
        }
        if (square[(int)points[line][0].getX()][(int)points[line][0].getY()] == square[(int)points[line][2].getX()][(int)points[line][2].getY()]){
            pointSet.add(points[line][0]);
            pointSet.add(points[line][2]);
        }
        Point[] pointToChange = new Point[pointSet.size()];
        int i = 0;
        for(Point point: pointSet){
            pointToChange[i] = point;
            i++;
        }
        return pointToChange;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

