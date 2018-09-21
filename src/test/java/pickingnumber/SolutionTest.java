package pickingnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void correct(){
        int[] ints = {4, 6, 5, 3 , 3, 1, 4, 8, 9, 8, 9, 8, 9};

        assertEquals(6, Solution.pickingNumbers(ints));
    }

}