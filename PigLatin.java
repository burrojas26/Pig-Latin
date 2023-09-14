//Jasper Burroughs 9/8/2023 Pig Latin Project - uses a phrase
import java.util.Scanner;


public class PigLatin {
    public static void main(String[] args) {
        String phrase = "";
        String edited = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter phrase: ");
        phrase = scan.nextLine().toLowerCase();
        String origPhrase = phrase;
        int len = phrase.length();
        for (int i = 0; i < len; i++) {
            if (origPhrase.charAt(i) == ' ') {
                phrase = origPhrase.substring(0, i);
                System.out.println(phrase);
                origPhrase = origPhrase.substring(i+1, origPhrase.length());
                if (phrase.charAt(0) == 'a' || phrase.charAt(0) == 'e' || phrase.charAt(0) == 'i' || phrase.charAt(0) == 'o' || phrase.charAt(0) == 'u') {
                    edited += phrase + "way ";
                }
                else {
                    edited += phrase.substring(1, phrase.length()) + phrase.substring(0, 1) + "ay ";
                }
                len = origPhrase.length();
                i = 0;
            }
            
        }
        if (origPhrase.charAt(0) == 'a' || origPhrase.charAt(0) == 'e' || origPhrase.charAt(0) == 'i' || origPhrase.charAt(0) == 'o' || origPhrase.charAt(0) == 'u') {
            edited += origPhrase + "way ";
        }
        else {
            edited += origPhrase.substring(1, origPhrase.length()) + origPhrase.substring(0, 1) + "ay ";
            System.out.println(edited);
        }
        System.out.println(edited);
        
    }
}
