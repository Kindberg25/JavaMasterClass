public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sumEvenDigits = 0;

        while (number > 0) {
            int evenDigit = number % 10;
            if (evenDigit % 2 == 0)
                sumEvenDigits = sumEvenDigits + evenDigit;
            number /= 10;
        }
        return sumEvenDigits;
    }
}
