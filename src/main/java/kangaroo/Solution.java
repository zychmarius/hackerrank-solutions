package kangaroo;

public class Solution {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if(x1 == x2){
            if(v1 == v2){
                return "YES";
            }else{
                return "NO";
            }
        }
        int kFirstPosition, kFirstJump;
        int kSecondPosition, kSecondJump;
        if(x1<x2){
            kFirstPosition = x1;
            kFirstJump = v1;
            kSecondPosition = x2;
            kSecondJump = v2;
        }else{
            kFirstPosition = x2;
            kFirstJump = v2;
            kSecondPosition = x1;
            kSecondJump = v1;
        }
        if(kSecondJump>=kFirstJump){
            return "NO";
        }
        while(kFirstPosition<kSecondPosition){
            kFirstPosition += kFirstJump;
            kSecondPosition += kSecondJump;
            if(kFirstPosition == kSecondPosition){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0,3,4,5));
    }
}
