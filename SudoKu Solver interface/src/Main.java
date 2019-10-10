import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\happy\\IdeaProjects\\SudoKu Solver interface\\src\\sample.sdkx";
        Board b = new Board(fileName);
        System.out.println(b);

        String fileName2 = "C:\\Users\\happy\\IdeaProjects\\SudoKu Solver interface\\src\\sample2.ss";
        Board c = new Board(fileName2);
        System.out.println(c);

    }
}

