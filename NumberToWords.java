public class NumberToWords {
    public static void main(String[] args) {

        int num = 2917;

        String[] ones = {
                "", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
                "", "", "twenty", "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        if (num >= 1000) {
            System.out.print(ones[num / 1000] + " thousand ");
            num = num % 1000;
        }

        if (num >= 100) {
            System.out.print(ones[num / 100] + " hundred ");
            num = num % 100;
        }

        if (num >= 20) {
            System.out.print(tens[num / 10] + " ");
            num = num % 10;
        }

        if (num > 0) {
            System.out.print(ones[num]);
        }
    }
}