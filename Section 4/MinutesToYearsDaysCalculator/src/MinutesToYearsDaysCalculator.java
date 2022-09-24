public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {
            long XX = minutes;
            long YY = (XX / (365 * 24 * 60));
            long ZZ = ((XX / (60 * 24)) % 365);
            System.out.println(XX + " min = " + YY + " y and " + ZZ + " d ");

        }

    }

}
