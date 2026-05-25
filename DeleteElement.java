public class DeleteElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int deleteIndex = 2;

        System.out.println("Array after deletion:");

        for (int i = 0; i < arr.length; i++) {

            if (i != deleteIndex) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}