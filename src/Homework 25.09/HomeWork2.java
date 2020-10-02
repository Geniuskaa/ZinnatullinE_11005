import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        String sentence = "Hello, Mr.Sanches. How are you?";
        String[] words = sentence.split(" ");
        int l = words.length;
        int indexOfBiggest = 0;

        for (int i = 0; i < l - 1; i++) {

            if (words[i].length() > words[i + 1].length()) {
                indexOfBiggest = i;
            }
        }

        System.out.println("Самое длинное слово: " + words[indexOfBiggest]);
    }
}
