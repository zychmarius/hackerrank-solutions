package drawingbook;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {


    @Test
    public void expectedOutputzeroFirst(){
        assertEquals(0, Solution.pageCount(1,1));
    }

    @Test
    public void expectedOutputzeroEnd(){
        assertEquals(0, Solution.pageCount(20,20));
    }


    @Test
    public void expectedOutputOne(){
        assertEquals(1, Solution.pageCount(6,2));
    }
}