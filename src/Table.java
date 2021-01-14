import java.util.Arrays;

public class Table {

    public static int[] bubbleSort(int[] table)
    {

        while(!isSorted(table)) {
            for (int i = 0; i < table.length-1; i++) {
                if (table[i] > table[i+1]) {
                    int tmp = table[i+1];
                    table[i+1] = table[i];
                    table[i] = tmp;
                }
            }
        }
        return table;
    }


    public static boolean isSorted(int[] table)
    {
        for(int i=0;i< table.length-1; i++)
        {
            if(!(table[i]<=table[i+1]))
                return false;
        }
        return true;
    }
}
