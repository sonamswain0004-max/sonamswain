public class ArrayLength {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int count = 0;

        for (int x : arr) {
            count++;
        }

        System.out.println("Length of array = " + count);
    }
}