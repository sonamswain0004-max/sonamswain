public class InsertElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int element = 5;
        int index = 3;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = element;

        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Array after insertion:");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}