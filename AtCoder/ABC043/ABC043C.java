import java.io.*;
import java.util.*;

public class ABC043C {
    public static void main(String args[]) {
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = br.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];

        int ans = Integer.MAX_VALUE;
        for(int i=min; i<=max; i++) {
            int sum = 0;
            for(int num: arr) {
                sum += (num-i)*(num-i);
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
}
