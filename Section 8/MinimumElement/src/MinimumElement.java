import java.util.Scanner;


public class MinimumElement {

    public static void main(String[] args) {
        int count = readInteger();

        int[] returnedArray = readElements(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);
    }

    private static int readInteger(){
        System.out.println("Enter the length of the array: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    private static int[] readElements(int n){
        System.out.println("Read " + n + " integers:");
        int[] arr =  new int[n];
        Scanner scanner =  new Scanner(System.in);
        for(int i=0;i<n;i++){
            int a = scanner.nextInt();
            arr[i] = a;
        }
        return arr;
    }

    private static int findMin(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
