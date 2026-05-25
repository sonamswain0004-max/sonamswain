public class AddTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {2, 3, 4, 1};
        int[] arr2 = {2, 3, 5, 6, 7, 8, 9};

        int max = Math.max(arr1.length, arr2.length);

        System.out.println("Addition of arrays:");

        for (int i = 0; i < max; i++) {

            int a = 0;
            int b = 0;

            if (i < arr1.length) {
                a = arr1[i];
            }

            if (i < arr2.length) {
                b = arr2[i];
            }

            System.out.print((a + b) + " ");
        }
    }
}