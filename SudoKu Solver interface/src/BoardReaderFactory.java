import java.io.FileNotFoundException;

public class BoardReaderFactory {
    public static Board getFile(String name) throws FileNotFoundException {
        if (name.endsWith(".ss")) {
            return new BoardSS(name);
        } else if (name.endsWith(".sdkx")) {
            return new BoardSdk(name);
        }
        throw new UnsupportedOperationException(name + " is not supported.");
    }
}
