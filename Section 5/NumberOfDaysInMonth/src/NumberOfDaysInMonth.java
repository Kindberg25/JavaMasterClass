public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) {
            return false;
        } else return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 0 || year > 9999) {
            return -1;
        } else {

            switch (month) {
                // Month 1,3,5,7,8,10,12 has 31 days
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;

                // Month 4,6,9,11 has 30 days
                case 4: case 6: case 9: case 11:
                    return 30;

                // Month 2 has 28 days unless it's LeapYear, then it has 29 days
                default:
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }


            }
        }
    }
}




