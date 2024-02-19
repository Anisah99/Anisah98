import java.util.Arrays;
import java.util.Random;
public class ArrayUtils {
    public static void removeRandomEntries(int[] arr) {
        Random rand = new Random();
        while (arr.length > 0) {
            int index = rand.nextInt(arr.length); // pick a random index
            int temp = arr[index]; // save the value at the random index
            System.arraycopy(arr, index + 1, arr, index, arr.length - (index + 1)); // shift elements to the left to overwrite the random element
            arr = Arrays.copyOf(arr, arr.length - 1); // create a new array with one less element
        }
    }
}