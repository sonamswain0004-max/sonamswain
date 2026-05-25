public class StringAscending {
    public static void main(String[] args) {

        String[] arr = {"Ram", "Amar", "Cel", "David", "Bunny"};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].compareTo(arr[j]) > 0) {

                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Ascending order:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}