package Day2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class demo1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int min = arr.get(0), max= arr.get(0);
    long sum=0;
    for (Integer num : arr) {
      if (num<min) min = num;
      if (num>max) max = num;
      sum = sum + num;
    }
    // System.out.println(min+" "+max+ " "+sum);
    System.out.println((sum-max)+" "+(sum-min));

    }

}

public class miniMaxSum {
    public static void main(String[] args) throws IOException {
       
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        demo1.miniMaxSum(arr);

    }
}
