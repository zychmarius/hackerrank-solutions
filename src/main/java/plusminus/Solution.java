package plusminus;

public class Solution {
    static void plusMinus(int[] arr) {
        float plusSum = 0;
        float minusSum = 0;
        float zerosSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zerosSum++;
            }else if(arr[i] > 0){
                plusSum++;
            }else{
                minusSum++;
            }
        }
        System.out.format("%.5f%n",plusSum/arr.length);
        System.out.format("%.5f%n",minusSum/arr.length);
        System.out.format("%.5f%n",zerosSum/arr.length);
    }

    public static void main(String[] args) {
        int[] array = {-4, 3 , -9, 0, 4, 1};
        plusMinus(array);
    }
}
