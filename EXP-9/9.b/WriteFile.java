import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of(args.length == 0 ? "output.txt" : args[0]);
        try (BufferedWriter writer = java.nio.file.Files.newBufferedWriter(path)) {
            writer.write("Java file output writes text to a path.");
            writer.newLine();
            writer.write("The try-with-resources block closes the writer.");
        }
        System.out.println("Wrote " + path);
    }
}
