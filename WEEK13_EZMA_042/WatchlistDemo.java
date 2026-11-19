import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class WatchlistDemo {
    public static void main(String[] args) throws IOException {
        
    
        try (PrintStream file = new PrintStream(new FileOutputStream("watchlist.txt"), false, "UTF-8")) {
            file.println("Project Hail Mary"); // movie title
            file.println("Adventure");         // genre
            file.println(8.2);                 // user rating
        }

        
        try (BufferedReader readFile = new BufferedReader(
                new InputStreamReader(new FileInputStream("watchlist.txt"), StandardCharsets.UTF_8))) {
            
            List<String> lines = new ArrayList<>();
            String line;
            
            // Read lines until end of file
            while ((line = readFile.readLine()) != null) {
                lines.add(line);
            }
            
            String[] arraylines = lines.toArray(new String[0]);

            // Validate structure length
            if (arraylines.length != 3) {
                System.out.println("File should contain 3 lines!");
                return; // Exit if structure is invalid
            }

            // Validation check for empty rating line
            if (arraylines[2].trim().isEmpty()) {
                System.out.println("Rating is necessary");
                return;
            }

            double rating;
            try {
                rating = Double.parseDouble(arraylines[2].trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Rating must be a valid number!");
                return;
            }

            // Validate rating numerical range
            if (rating < 0.0 || rating > 10.0) {
                System.out.println("Error: Rating must be between 0.0 and 10.0!");
                return;
            }

            // Print successfully validated data
            System.out.println("Movie title: " + arraylines[0]);
            System.out.println("Genre: " + arraylines[1]);
            System.out.println("Rating: " + rating);
        }
    }
}