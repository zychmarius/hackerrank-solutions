package staircase;

public class Solution {
    static void staircase(int n) {
        String startText;
        String textTmp;
        String text;
        if(n > 0) {
            startText = "#";

            for (int i = 0; i < n; i++) {
                text = startText;
                for (int j = 0; j < n - 1 - i; j++) {
                    textTmp = " " + text;
                    text = textTmp;
                }
                System.out.println(text);
                startText = startText + "#";
            }
        }

    }

    public static void main(String[] args) {
        staircase(0);
    }
}
