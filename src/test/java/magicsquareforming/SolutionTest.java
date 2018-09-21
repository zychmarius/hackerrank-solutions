package magicsquareforming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {




    @Test
    public void whenMagicSquereSumIsCorrect(){
        int[][] ints = {{ 4, 8, 2}, { 4, 5, 7}, { 6, 1, 6}};

        int[] testInt = {14, 16, 13, 14, 14, 15, 15, 13};

        Solution s = new Solution();

        assertArrayEquals(testInt, s.magicSquareSum(ints));
    }

    @Test
    public void whenBooleansSquareCcorrect(){
        int[][] ints = {{ 4, 8, 2}, { 4, 5, 7}, { 6, 1, 6}};

        boolean[] testBoolean = {true, true, false, false, true, true, true, true};

        Solution s = new Solution();

        assertArrayEquals(testBoolean, s.correctLineNumber(ints));
    }

    @Test
    public void whenCorrectNamberIsCorrect(){
        Solution s = new Solution();
        boolean[] testBoolean = {false, true, false, true, true, true, true, false, false};
        int[] testInt = {14, 16, 13, 14, 14, 15, 15, 13};
        boolean[] test2Boolean = {true, true, false, false, true, true, true, true};
        int[][] ints = {{ 4, 8, 2}, { 4, 5, 7}, { 6, 1, 6}};

        assertArrayEquals(testBoolean, s.correctNumber(testInt, test2Boolean, ints ));


    }

    @Test
    public void whenNuberIsAnList(){
        Solution s = new Solution();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(9);
        list2.add(3);
        list2.add(4);

        assertFalse(s.checkIfChenge(list2,list));

    }

    @Test
    public void allTest(){
        int[][] ints = {{ 4, 8, 2}, { 4, 5, 7}, { 6, 1, 6}};
        assertEquals(4, Solution.formingMagicSquare(ints));

    }
}