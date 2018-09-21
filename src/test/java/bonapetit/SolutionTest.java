package bonapetit;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void soutBonApetit(){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(2);
        list.add(9);
        Solution.bonAppetit(list,1, 7);
        String string = outContent.toString();
        assertEquals("Bon Appetit", string);
    }

    @Test
    public void soutFiveExpected(){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(2);
        list.add(9);
        Solution.bonAppetit(list,1, 12);
        assertEquals("5", outContent.toString());
    }


}