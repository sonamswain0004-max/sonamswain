public class SquareOfElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Squares:");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] * arr[i] + " ");
        }
    }
}