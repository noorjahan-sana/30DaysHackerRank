package Day1;

import java.util.ArrayList;
import java.util.List;

public class SumOfArrayElements {
    public static void main(String[] args) throws Exception {
        List<Integer> ar =new ArrayList<Integer>();
        ar.add(6);
        ar.add(7);
        ar.add(8);

       int sum=0;
      for (Integer num : ar) {
        sum = sum+num;
       } 
      System.out.println(sum);

    }
}

