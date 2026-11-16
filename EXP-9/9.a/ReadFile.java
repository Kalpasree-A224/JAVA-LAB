import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of(args.length == 0 ? "sample2.txt" : args[0]);
        try (BufferedReader reader = java.nio.file.Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
