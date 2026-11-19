import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        
        int totalLines = CountDemo.countLines("watchlist.txt");
        System.out.println("Number of lines in file watchlist.txt is: " + totalLines);
    }
}