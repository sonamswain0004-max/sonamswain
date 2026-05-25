public class SumOfEvenDigits {
    public static void main(String[] args) {

        int[] arr = {231, 554, 572, 962, 24, 1};

        System.out.println("Sum of even digits:");

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int sum = 0;

            while (num > 0) {

                int digit = num % 10;

                if (digit % 2 == 0) {
                    sum = sum + digit;
                }

                num = num / 10;
            }

            System.out.print(sum + " ");
        }
    }
}