import java.util.Arrays;

public class ThirdTask {

    public static void main(String[] args) {
        String n = "bca cba cab acb";
        String[] wordsArray = n.split(" ");

        Arrays.sort(wordsArray);  //  O(n log n)

        for (int i=0; i < wordsArray.length; i++) {
            System.out.println(wordsArray[i]);
        }

    }
}

// https://habr.com/ru/post/344288/
