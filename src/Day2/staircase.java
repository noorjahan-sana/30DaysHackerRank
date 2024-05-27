package Day2;

import java.io.*;

class demo {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    int k=0;
    for (int i = 1; i <=n ; i++) {
        k = n - (i-1);
        for (int j = 1; j <= n; j++) {
            if(k==j) {
                while(k<=n){
                    System.out.print("#");
                    k= k +1;
                }
            }
            else System.out.print(" ");
        }
        System.out.println("");
    }

    }

}

public class staircase {
    public static void main(String[] args) throws IOException {
       
        int n = 6;
        demo.staircase(n);

    }
}

