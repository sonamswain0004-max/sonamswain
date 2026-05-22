import java.util.Scanner;

public class InsertEvenValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 even numbers:");

        for (int i = 0; i < arr.length; i++) {

            int num = sc.nextInt();

            if (num % 2 == 0) {
                arr[i] = num;
            } else {
                System.out.println("Not an even number");
                i--;
            }
        }

        System.out.println("Array elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}