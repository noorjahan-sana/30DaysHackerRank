package Day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Results {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float pos=0, neg=0, zero=0;
    for (Integer integer : arr) {
        if(integer>0) ++pos;
        else if(integer<0) ++neg;
        else zero++;
    }
    System.out.printf("%.6f%n",pos/arr.size());
    System.out.printf("%.6f%n",neg/arr.size());
    System.out.printf("%.6f%n",zero/arr.size());
    }

}

public class plusMinus {
    public static void main(String[] args) {
      
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, -2, 0, -3, 4));
        Results.plusMinus(arr);

    }
}
