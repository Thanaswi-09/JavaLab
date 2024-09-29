//6.	Write a java program to find whether given sentence is Pangram or not. If it is pangram, then print 1 else print -1.A pangram is a sentence containing every letter in the English Alphabet. Ex: The quick brown fox jumps over the lazy Dog.
import java.util.Scanner;

public class PangramChecker {
    static String isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        int index = 0;
        int count = 0;
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a'; 
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
        }
        return count == 26 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.println(isPangram(sentence));
    }
}
