import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Board {
    private char[][] arr;

    public Board(String fileName) throws FileNotFoundException {
        arr = new char[9][9];
        readFile(fileName);


    }

    public void readFile(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner input = new Scanner(f);
        int rowNum = 0;
        while (input.hasNext()) {
            String line = input.next();
            for (int i = 0; i < arr[rowNum].length; i++) {
                char token = line.charAt(i);
                arr[rowNum][i] = token;
            }
            rowNum++;

        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                s.append(arr[i][j]);
            }
            s.append("\n");

        }
        return s.toString();
    }
}
