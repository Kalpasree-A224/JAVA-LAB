import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Filewriter {
    public static void main(String[] args) throws IOException {
        Path path = Path.of(args.length == 0 ? "output.txt" : args[0]);
        try (BufferedWriter writer = java.nio.file.Files.newBufferedWriter(path)) {
            writer.write("This text was written with a buffered Java writer.");
            writer.newLine();
            writer.write("Pass a path argument to choose the output file.");
        }
        System.out.println("Wrote " + path);
    }
}
