public class ShiftZerosRight {
    public static void main(String[] args) {

        int[] arr = {2, 0, 5, 3, 1, 0, 3, 1};

        int[] result = new int[arr.length];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        System.out.println("After shifting zeros right:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}