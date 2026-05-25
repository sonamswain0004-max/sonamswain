public class ShiftHalfElements {
    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 9, 3, 1};

        int mid = arr.length / 2;

        System.out.println("After shifting:");

        for (int i = mid; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}