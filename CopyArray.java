public class CopyArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        int[] arr2 = new int[arr1.length];

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        System.out.println("Copied array:");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}