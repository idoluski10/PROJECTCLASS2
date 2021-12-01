import java.util.Scanner;

public class excrrise1 {
    public static void main(String[] args) {
        String word = "apple";
        String sentence = "i like eating apples";
        System.out.println(checkIfExxist(word, sentence));
    }
    public static boolean checkIfExxist(String word, String sentence) {
        String wordInSentence = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                wordInSentence = wordInSentence + sentence.charAt(i);
                if (word.equals(wordInSentence)) {
                    return true;
                }
            } else if (sentence.charAt(i) == ' ') {
                if (wordInSentence.equals(word))
                    return true;

                wordInSentence = "";
            }
        }
        return false;
    }


}
