public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int XX = kiloBytes;
            int YY = kiloBytes / 1024;
            int ZZ = kiloBytes % 1024;

            System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB");
        }


    }


}
