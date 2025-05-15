package LW_05;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        StringBuilder newSentence = new StringBuilder();
        int index = 0;

        while (index < sentence.length()) {
            if (index + wordToReplace.length() <= sentence.length() && sentence.substring(index, index + wordToReplace.length()).equals(wordToReplace)) {
                newSentence.append(replacementWord);
                index += wordToReplace.length();
            } else {
                newSentence.append(sentence.charAt(index));
                index++;
            }
        }

        System.out.println("Original sentence: " + sentence);
        System.out.println("New sentence: " + newSentence.toString());

    }
}
