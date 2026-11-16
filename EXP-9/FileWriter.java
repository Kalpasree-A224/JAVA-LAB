import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        Path path = Path.of(args.length == 0 ? "output.txt" : args[0]);
        try (BufferedWriter writer = java.nio.file.Files.newBufferedWriter(path)) {
            writer.write("This file was created by the Java file-writing experiment.");
            writer.newLine();
            writer.write("The writer is closed automatically after the try block.");
        }
        System.out.println("Wrote " + path);
    }
}
