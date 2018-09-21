package countingvalleys;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void valleyCountOne(){
        assertEquals(2, Solution.countingValleys(8,"UDDDUDUUUDDU"));
    }

}