//Jasper Burroughs 9/8/2023 Pig Latin Project
import java.util.Scanner;


public class PigLatin {
    public static void main(String[] args) {
        String phrase = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter phrase: ");
        phrase = scan.nextLine();
        int len = phrase.length();
        if (phrase)
        String edited = phrase.substring(1, len) + phrase.substring(0, 1) + "ay";
        System.out.println(edited);
    }
}