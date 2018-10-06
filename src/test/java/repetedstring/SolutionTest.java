package repetedstring;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {


    @Test
    public void testMethod(){

        String s ="epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
        long l = 549382313570l;

        assertEquals(16481469408l, Solution.repeatedString(s, l));
    }

}