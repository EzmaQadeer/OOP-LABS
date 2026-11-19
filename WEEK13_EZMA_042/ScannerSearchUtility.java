import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerSearchUtility {

    public static boolean searchFileWithScanner(String fileName, String targetText) throws IOException {
        Path path = Path.of(fileName);

        // Check if the file exists
        if (!Files.exists(path) || !Files.isRegularFile(path)) {
            System.out.println("Error: The file does not exist at path: " + path.toAbsolutePath());
            return false;
        }

        // Check if the file is empty (0 bytes)
        if (Files.size(path) == 0) {
            System.out.println("Error: The file is empty.");
            return false;
        }

        // Read the whole file into a single String 
        String entireContent = "";
        try (Scanner scanner = new Scanner(path, StandardCharsets.UTF_8)) {
            scanner.useDelimiter("\\A"); 
            
            if (scanner.hasNext()) {
                entireContent = scanner.next();
            }

            
         IOException ex = scanner.ioException();
            if (ex != null) {
                throw ex;
            }
        }

        return entireContent.contains(targetText);
    }

    public static void main(String[] args) {
        try {
            
            String target = "Adventure";
            boolean found = searchFileWithScanner("watchlist.txt", target);
            
            if (found) {
                System.out.println("Success: Target text '" + target + "' was found in the file!");
            } else {
                System.out.println("Result: Target text '" + target + "' was not found.");
            }
            
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }
}