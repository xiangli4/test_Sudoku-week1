import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class TestSudoku {
  @Test
  public void testToString() throws FileNotFoundException {
    String fileName = "C:\\Users\\happy\\IdeaProjects\\Sudoku Solver\\src\\TestSudoku\\testSample.sdkx";
    Board b = new Board(2, fileName);
    String expect = "x6\n" +
            "1x\n";

    Assert.assertEquals(expect, b.toString() );


  }
  @Test
  public void testLength() throws FileNotFoundException {
    String fileName = "C:\\Users\\happy\\IdeaProjects\\Sudoku Solver\\src\\TestSudoku\\testSample.sdkx";
    Board b = new Board(2, fileName);
    // how do I compare the number of columns?
    Assert.assertEquals(2, b.getArray().length);

  }

  @Test
  public void testArray() throws FileNotFoundException {
    String fileName = "C:\\Users\\happy\\IdeaProjects\\Sudoku Solver\\src\\TestSudoku\\testSample.sdkx";
    Board b = new Board(2, fileName);
    char[][] expectArray = {{'x', '6'}, {'1', 'x'}};
    // can I use this syntax to compare two dimensional array?
    Assert.assertArrayEquals(expectArray, b.getArray());
  }
}
