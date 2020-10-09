// Сортировка слов
// Cложность по времени O(n*n)
// Сложность по памяти O(n)


public class ThirdTask {

    public static void wordSort(String[] array, int minDlina) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].charAt(0) > array[j].charAt(0)) {
                    String k = array[j];
                    array[j] = array[i];
                    array[i] = k;
                    System.out.println("Fisrt - OK");
                }

                if (array[i].charAt(0) == array[j].charAt(0)) { //Проверка слов с одинаковой первой буквой
                    boolean t = true;
                    for (int h = 1; h < minDlina - 1; h++) {
                        if (array[i].charAt(h) < array[j].charAt(h)) {
                            System.out.println("Nothing changed");
                            break;
                        }

                        if (array[i].charAt(h) > array[j].charAt(h)) {
                            t = false;
                        }

                        if (t == false) {
                            String k = array[j];
                            array[j] = array[i];
                            array[i] = k;
                            System.out.println("Same words changed");
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String n = "bca cha cab acb";
        String[] wordsArray = n.split(" ");
        int minDlina = wordsArray[0].length();

        for (int j = 0; j < wordsArray.length; j++) {
            if (minDlina > wordsArray[j].length()) {
                minDlina = wordsArray[j].length();
            }
        }

        wordSort(wordsArray, minDlina);

        for (int i = 0; i < wordsArray.length; i++) {
            System.out.println(wordsArray[i]);
        }

        //Arrays.sort(wordsArray);

    }
}

// https://habr.com/ru/post/344288/
