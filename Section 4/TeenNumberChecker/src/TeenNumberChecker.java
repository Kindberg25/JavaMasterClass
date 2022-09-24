public class TeenNumberChecker {

    public static boolean hasTeen(int T1, int T2, int T3) {

        return (T1 >= 13 && T1 <= 19) || (T2 >= 13 && T2 <= 19) || (T3 >= 13 && T3 <= 19);


        /*
        if ((T1 >= 13 && T1 <= 19) || (T2 >= 13 && T2 <= 19) || (T3 >= 13 && T3 <= 19)) {
            return true;
        } else {
            return false;
        }

        */

    }
     public static boolean isTeen(int T) {
        return (T >= 13 && T <=19);
     }


}
