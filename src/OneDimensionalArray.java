import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray extends Table {

    static int[] table;

    public static void createTable() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers in array: ");
        int numbers = input.nextInt();
        table = new int[numbers];
        System.out.println("Enter numbers: ");

        for (int i = 0; i < numbers; i++) {
            table[i] = input.nextInt();
        }
        System.out.println("Initial table: " + Arrays.toString(table));
        System.out.println();
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(table)));
    }
}
