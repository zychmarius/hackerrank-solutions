package electronicsschop;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {


    @Test
    public void expectedNineOutput(){
        int[] ints = {3, 1};
        int[] ints2 = {5, 2, 8};
        assertEquals(9, Solution.getMoneySpent(ints, ints2, 10));
    }

    @Test
    public void expectedMinusOneOutput(){
        int[] ints = {4};
        int[] ints2 = {5};
        assertEquals(-1, Solution.getMoneySpent(ints, ints2, 5));
    }

}