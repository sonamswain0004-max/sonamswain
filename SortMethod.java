import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {

        int[] arr = {9, 5, 6, 1, 2, 7};

        Arrays.sort(arr);

        System.out.println("Sorted array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}