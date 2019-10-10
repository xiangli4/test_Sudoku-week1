import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Board {
    private char[][] arr;

    public Board(String fileName) throws FileNotFoundException {
        arr = new char[9][9];
        readFile(fileName);


    }

    public char[][] getArray() {
        return arr;
    }

    public void readFile(String fileName) throws FileNotFoundException {
        arr = BoardReaderFactory.getFile(fileName).getArray();
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

