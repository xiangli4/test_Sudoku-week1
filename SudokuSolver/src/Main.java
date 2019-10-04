import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "src/testSudoku.sdkx";
        Board b = new Board(fileName);
        System.out.println(b);

    }
}
