package equalityinaarray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {


    @Test
    public void equalizeArrayMethodTest(){

        int[] array = {1, 2, 3, 1, 2, 3, 3, 3};

        assertEquals(4, Solution.equalizeArray(array));
    }

}