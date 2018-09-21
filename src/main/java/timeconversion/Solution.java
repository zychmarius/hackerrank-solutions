package timeconversion;

public class Solution {
    static String timeConversion(String s) {
        String test = "" + s.charAt(0) + s.charAt(1);
        int testValue = Integer.parseInt(test);
        if(testValue == 12){
            if (s.charAt(s.length()-2) == 'A'){
                return "00"+s.substring(2,s.length()-2);
            }else{
                return "12"+s.substring(2,s.length()-2);
            }
        }
        if(s.charAt(s.length()-2) == 'A'){
            return s.substring(0,s.length()-2);
        }
        return testValue+12+s.substring(2,s.length()-2);

    }

    public static void main(String[] args) {
        System.out.println(timeConversion("08:45:78PM"));
        System.out.println(timeConversion("12:45:78AM"));
        System.out.println(timeConversion("12:45:78PM"));
    }

}
