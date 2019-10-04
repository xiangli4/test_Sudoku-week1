import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Users\\happy\\IdeaProjects\\SudokuSolver\\src\\ReadMe.txt";
        Board b = new Board(fileName);
        System.out.println(b);

    }
}
