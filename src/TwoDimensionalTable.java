import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoDimensionalTable extends Table {

    static Integer[][] table;

    public static void createTable() {
        //Create and print two-dimensional array
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows in array: ");
        int rows = input.nextInt();
        System.out.print("How many columns in array: ");
        int columns = input.nextInt();
        System.out.println("Enter numbers: ");
        table = new Integer[rows][columns];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Initial table: ");

        for (int i = 0; i < table.length; i++) {
            System.out.println();
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
        }
        System.out.println();

        //Create temporary one-dimensions array
        int[] newTable = new int[table.length * table[0].length];
        ArrayList<Integer> list = new ArrayList<>(0);
         for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                list.add(table[i][j]);
            }
        }

        for (int i = 0; i < table.length * table[0].length; i++) {
            newTable[i] = list.get(i);
        }
        System.out.println();
        System.out.println("Sorted array: ");
        int k = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = bubbleSort(newTable)[k];
                k++;
            }
        }

        for (Integer[] integers : table) {
            System.out.println();
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();

    }
}
