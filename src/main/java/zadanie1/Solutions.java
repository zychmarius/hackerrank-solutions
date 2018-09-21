package zadanie1;

public class Solutions {
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int[] result = new int[2];
        int[] a = {a0, a1, a2};
        int[] b = {b0, b1, b2};
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                if (a[i] > b[i]) {
                    result[0]++;
                } else {
                    result[1]++;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
       int[] results = solve(5,5,5,5,5,5);
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]+ " ");
        }
    }
}
