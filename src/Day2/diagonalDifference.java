package Day2;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
  
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int first=0, second=0;
    for (int i = 0; i < arr.size(); i++) {
        first = first + arr.get(i).get(i);
    }
     for (int i = 0; i < arr.size(); i++) {
        second = second + arr.get(i).get(arr.size() - (i+1));
    }
    return Math.abs(first-second) ;

    }

}

public class diagonalDifference {
    public static void main(String[] args) throws IOException {

        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(5);
        row1.add(2);
        row1.add(3);
        arr.add(row1); // Add row to the main list

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        arr.add(row2); // Add row to the main list

        List<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        arr.add(row3); // Add row to the main list

        int result = Result.diagonalDifference(arr);

        System.out.println(result);
    }
}
