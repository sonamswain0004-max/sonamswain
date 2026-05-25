public class RemoveBeforeIndex {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 1, 3, 2};

        int index = 3;

        System.out.println("Output:");

        for (int i = index; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}