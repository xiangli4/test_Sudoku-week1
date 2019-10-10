import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BoardSS extends Board implements BoardReader {
    //private char[][] arr;

    public BoardSS(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    @Override
    public void readFile(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner input = new Scanner(f);
        int rowNum = 0;
        while (input.hasNext()) {
            String line = input.next();
            if (!line.contains("-")) {
                int colNum = 0;
                for (int i = 0; i < line.length(); i++) {
                    char token = line.charAt(i);

                    if (Character.isDigit(token)) {
                        super.getArray()[rowNum][colNum] = token;
                        colNum++;
                    } else if (token == '.') {
                        super.getArray()[rowNum][colNum] = 'X';
                        colNum++;
                    }
                }
                rowNum++;
            }

        }
    }


}

