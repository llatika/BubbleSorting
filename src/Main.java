import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] Table;

    public static void main(String[] args) {
        System.out.println("One or two-dimensional table [1 or 2]: ");
        Scanner input = new Scanner(System.in);
        int dimension = input.nextInt();
        if (dimension == 1)
            OneDimensionTable.createTable();
        else
            TwoDimensionalTable.createTable();
    }
}
