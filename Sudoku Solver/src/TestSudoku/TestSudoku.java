import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class TestSudoku {
  @Test
  public void testToString() throws FileNotFoundException {
        String fileName = "C:\\Users\\happy\\IdeaProjects\\Sudoku Solver\\src\\TestSudoku\\testSample.sdkx";
        Board b = new Board(fileName);
        String expect = "x6x1x4x5x\n" +
                "xx83x56xx\n" +
                "2xxxxxxx1\n" +
                "8xx4x7xx6\n" +
                "xx6xxx3xx\n" +
                "7xx9x1xx4\n" +
                "5xxxxxxx2\n" +
                "xx72x69xx\n" +
                "x4x5x8x7x\n";

        Assert.assertEquals(expect, b.toString() );
  }

  @Test
  public void testGetBoard() throws FileNotFoundException {
        String fileName = "Sudoku Solver/src/TestSudoku/testSample.sdkx";
        Board b = new Board(fileName);
        char[][] expectedArray = new char[][]{
            {'x', '6', 'x', '1', 'x', '4', 'x', '5', 'x'},
            {'x', 'x', '8', '3', 'x', '5', '6', 'x', 'x'},
            {'2', 'x', 'x', 'x', 'x', 'x', 'x', 'x', '1'},
            {'8', 'x', 'x', '4', 'x', '7', 'x', 'x', '6'},
            {'x', 'x', '6', 'x', 'x', 'x', '3', 'x', 'x'},
            {'7', 'x', 'x', '9', 'x', '1', 'x', 'x', '4'},
            {'5', 'x', 'x', 'x', 'x', 'x', 'x', 'x', '2'},
            {'x', 'x', '7', '2', 'x', '6', '9', 'x', 'x'},
            {'x', '4', 'x', '5', 'x', '8', 'x', '7', 'x'},
        };

        Assert.assertArrayEquals(expectedArray, b.getBoard()) ;

  }
}
