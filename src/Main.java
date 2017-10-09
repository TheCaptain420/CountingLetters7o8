import com.sun.xml.internal.ws.wsdl.writer.document.Import;
import java.util.*;
import javax.rmi.CORBA.Util;

public class Main {



    public static void main(String args[]) {
        // Declarer og laver en Array
        char[] chars = createArray();
        // Viser alle "Chars"
        System.out.println("The lowercase letters are:");
        displayArray(chars);
        // Tæller bogstaver der bliver genbrugt
        int[] counts = countLetters(chars);
        // Her "Sout"er man dem bare
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
    }
    /** Create an array of characters (En ny klasse, der laver en array med 100 CHAR) */
    public static char[] createArray() {
        // Declarer en array med 100 char
        char[] chars = new char[100];
        // Laver tilfældige bogstaver, og ligger dem ind i arrayen
        for (int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        // Return the array...
        return chars;
    }
    /** Display the array of characters (en ny klasse som printer en bestemt opsætning af chars) */
    public static void displayArray(char[] chars) {
        // For dem til at blive printet i linjer af 20
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i] + " ");
            else
                System.out.print(chars[i] + " ");
        }
    }
    /** Count the occurrences of each letter( en ny klasse der tæller hvor mange gange hvert bogstav bliver brugt.) */
    public static int[] countLetters(char[] chars) {
        // Declarer en ny array, med 26 elementer(antal bogstaver)
        int[] counts = new int[26];
        // Tæller hvert bogstav
        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;
        return counts;
    }
    /** Display counts(En ny klasse, der viser antal gange hvert bogstav bliver brugt.) */
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }

}
