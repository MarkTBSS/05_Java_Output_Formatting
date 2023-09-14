//import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "java 100\n" +
            "cpp 65\n" +
            "python 50";
        Scanner scanner = new Scanner(mockInput);
        System.out.println("================================");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            System.out.printf("%-15s%03d%n", parts[0], 
            Integer.parseInt(parts[1]));
        }
        System.out.println("================================");
        scanner.close();
    }
}
