import java.util.Scanner;

public class ShubhyaProb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter How much Elements you want to Pass: ");
        int ArraySize = sc.nextInt();
        int[] Arr1 = new int[ArraySize];

        System.out.println("Enter Elements to store in array.  ");

        for (int k = 0; k < ArraySize; k++) {

            System.out.print("Array Element " + k + " :");
            Arr1[k] = sc.nextInt();

        }

        System.out.println();

        // Printing Array
        System.out.print("Your Array { ");

        for (int i : Arr1) {
            System.out.print(i + "  ");
        }
        System.out.print("}");
        System.out.println();
        System.out.println();

        // Calling checkDuplicate method
        checkDuplicates(Arr1);

    }

    public static void checkDuplicates(int[] Arr) {

        for (int i = 0; i < Arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[i] == Arr[j]) {
                    count++;
                    Arr[j] = -1;
                }
            }

            if (count > 1 && Arr[i] != -1) {
                System.out.println(Arr[i] + " is occured " + count + " times");
            }
        }
    }
}
