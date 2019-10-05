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
  public void testLength() throws FileNotFoundException {
    String fileName = "C:\\Users\\happy\\IdeaProjects\\Sudoku Solver\\src\\TestSudoku\\testSample.sdkx";
    Board b = new Board(fileName);
    //char[][] expectArray = {{'2', 'X'},{'X','2'}};
    Assert.assertEquals(9, b.getArray().length) ;

  }
}
