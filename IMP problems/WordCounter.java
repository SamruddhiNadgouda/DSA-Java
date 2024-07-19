import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String input = scanner.nextLine();
        scanner.close();

        int wordCount = countWords(input);
        int charCount = input.length();
        int sentenceCount = countSentences(input);

        System.out.println("Word count: " + wordCount);
        System.out.println("Character count: " + charCount);
        System.out.println("Sentence count: " + sentenceCount);
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    private static int countSentences(String text) {
        Pattern sentencePattern = Pattern.compile("[.!?]+");
        Matcher matcher = sentencePattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
/*
 Output:
 Enter your text:
The Indian Premier League (IPL) is cricket's grand extravaganza, offering high-octane T20 matches with a global cast of cricketing stars. It's not just cricket; it's a complete entertainment package, complete with passionate fans, electrifying finishes, and a carnival-like atmosphere. The IPL is the perfect blend of sport and spectacle, making it a cultural phenomenon and a must-watch sporting event.
Word count: 59
Character count: 403
Sentence count: 3
 */