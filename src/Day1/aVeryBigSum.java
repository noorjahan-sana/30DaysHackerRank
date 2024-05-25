package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aVeryBigSum {
    public static void main(String[] args) throws Exception {
        List<Long> ar = new ArrayList<>(Arrays.asList(1000L, 2000L, 3000L, 4000L, 5000L));
        long sum =0;
       for (Long num : ar) {
          sum = sum + num;
        }
     System.out.println(sum);
    }
}
