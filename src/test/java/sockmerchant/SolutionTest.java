package sockmerchant;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {


    @Test
    public void socksCorrect(){
        int[] ints = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        assertEquals(3, Solution.sockMerchant(9, ints)) ;

    }

}