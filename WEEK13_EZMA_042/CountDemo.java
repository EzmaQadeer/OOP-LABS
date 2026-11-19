import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
class CountDemo {

    public static int countLines(String fileName) throws IOException {
        try (BufferedReader readFile = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            
            int count = 0; // Fixed: Start at 0, not 1
            String line;
            
            while ((line = readFile.readLine()) != null) {
                count++;
            }
            return count;
        }
    }
}
