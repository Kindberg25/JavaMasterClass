public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x1, double x2) {
        int numDecimals = 1000;

        x1 = (int) (x1 * numDecimals);
        x2 = (int) (x2 * numDecimals);

        return x1 == x2;

        /*
        // Alternative solution
        if (x1 == x2) {
            return true;
        } else {
            return false;
        }
        */

    }

}
