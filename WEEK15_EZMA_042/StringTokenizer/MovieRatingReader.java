import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class MovieRatingReader {
    public static void main(String[] args) {
        String fileName = "ratings.txt";
        
        boolean hasAnyTokens = false;
        int validVoteCount = 0;
        int totalSum = 0;
        
        try (PrintStream file = new PrintStream(new FileOutputStream("rating.txt"), false, "UTF-8")) {
            file.println("4"); 
            file.println("4");        
            file.println("3");               
        }catch (FileNotFoundException e) {
            System.out.println("File could not be created/opened: " + e.getMessage());
            return;
        } catch (UnsupportedEncodingException e) {
            System.out.println("Encoding not supported: " + e.getMessage());
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("rating.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Skip blank lines or lines containing only whitespace
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Tokenize the current line
                StringTokenizer tokens = new StringTokenizer(line);

                while (tokens.hasMoreTokens()) {
                    hasAnyTokens = true; // We found at least one token in the file
                    String tokenStr = tokens.nextToken();

                    try {
                        int rating = Integer.parseInt(tokenStr);

                        // Validate that the rating is from 1 to 5 inclusive
                        if (rating >= 1 && rating <= 5) {
                            validVoteCount++;
                            totalSum += rating;
                        } else {
                            
                            System.out.println("Rejected rating (out of range 1-5): " + rating);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Rejected non-integer token: " + tokenStr);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Final check conditions 
        if (!hasAnyTokens) {
            System.out.println("No ratings found.");
        } else if (validVoteCount == 0) {
            System.out.println("No valid ratings found.");
        } else {
            double average = (double) totalSum / validVoteCount;
            System.out.println("Votes: " + validVoteCount);
            System.out.println("Average: " + average);
        }
    }
}