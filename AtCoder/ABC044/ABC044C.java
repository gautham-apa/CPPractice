import java.io.*;
import java.util.*;

public class ABC044C {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        int a = br.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = br.nextInt();
        Arrays.sort(arr);
        long[][] dp = new long[2501][51];
        dp[0][0] = 1;
        long ans = 0;
        for(int j=0; j<n; j++) {
            int num = arr[j];
            for(int i=2500; i>=0; i--) {
                if(i-num < 0) continue;
                if(i-num == 0) {
                    dp[i][1] += 1;
                    continue;
                }
                for(int k=1; k<=50; k++) {
                    dp[i][k] += dp[i-num][k-1];
                }
            }
        }

        for(int i=1; i<=2500; i++) {
            for(int k=1; k<=50; k++) {
                if(i/(double)k == a) ans += dp[i][k];
            }
        }

        System.out.println(ans);
    }
}
