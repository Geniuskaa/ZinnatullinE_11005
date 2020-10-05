
public class SecondTask {
    public static void binarySearch(int[] array, int number, int low, int high) {

        int medium = low + ((high - low) / 2);

        if (array[medium] == number) {
            System.out.println("Number is found! Position in array is: " + medium);
            return;
        }

        if (array[medium] > number) {
            high = medium - 1;
            binarySearch(array,number, low, high);
        }

        if (array[medium] < number) {
            low = medium + 1;
            binarySearch(array,number, low, high);
        }
    }

    public static void main(String[] args) {
        int x[] = {1,4,6,7,8,9,12,15,16,19,26,31};
        int n = 31;
        binarySearch(x,n,0,x.length - 1);
    }
}
