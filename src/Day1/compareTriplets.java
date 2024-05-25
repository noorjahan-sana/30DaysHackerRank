package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class compareTriplets {
    public static void main(String[] args) throws Exception {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> b = new ArrayList<>(Arrays.asList(0,5,1,2));
        
        List<Integer> result = new ArrayList<Integer>();
        int alice=0;
        int bob=0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i)>b.get(i)) alice = alice +1;
           if(a.get(i)<b.get(i)) bob = bob +1;
        }
        result.add(alice);
        result.add(bob);
        System.out.println(result);
        if(alice>bob) System.out.println("alice won");
        else System.out.println("Bob Won");
    }
}
