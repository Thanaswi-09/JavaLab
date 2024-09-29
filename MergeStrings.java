//7.	Given two strings s1 and s2, your task is to merge those strings to form a new merged string. A merge operation on two strings is described as follows: Append alternating characters from s1 and s2, respectively, to merged String. Once all of the characters in one of the strings have been merged, append the remaining characters in the other string to merged String.
import java.util.Scanner;

public class MergeStrings {
    static String mergeStrings(String s1, String s2) {
        String merged = "";
        int i = 0, j = 0;
        while (i < s1.length() || j < s2.length()) {
            if (i < s1.length()) {
                merged += s1.charAt(i++);
            }
            if (j < s2.length()) {
                merged += s2.charAt(j++);
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string (s1):");
        String s1 = scanner.nextLine();
        System.out.println("Enter second string (s2):");
        String s2 = scanner.nextLine();
        System.out.println("Merged string: " + mergeStrings(s1, s2));
    }
}
