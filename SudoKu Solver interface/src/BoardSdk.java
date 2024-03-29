import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BoardSdk extends Board implements BoardReader {
    //private char[][] arr;

    public BoardSdk(String fileName) throws FileNotFoundException {
        super(fileName);
        //readFile(fileName);

    }

    @Override
    public void readFile(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner input = new Scanner(f);
        int rowNum = 0;
        while (input.hasNext()) {
            String line = input.next();
            for (int i = 0; i < line.length(); i++) {
                char token = line.charAt(i);
                super.getArray()[rowNum][i] = token;
            }
            rowNum++;

        }
    }

//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                s.append(arr[i][j]);
//            }
//            s.append("\n");
//
//        }
//        return s.toString();
//    }


}
