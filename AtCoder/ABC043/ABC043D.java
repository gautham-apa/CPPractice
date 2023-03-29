import java.io.*;
import java.util.*;

public class ABC043D {
    public static void main(String args[]) {
        int[] count = new int[26];
        Scanner br = new Scanner(System.in);
        char[] s = br.next().toCharArray();

        int start = 0;
        for(int i=0; i<s.length; i++) {
            char c = s[i];
            count[c-'a']++;
            while(checkCount(count) >= 2 && (i-start+1) >= 2) {
                if(checkCount(count) > (i-start+1)/2) {
                    System.out.println((start+1)+" "+(i+1));
                    return;
                }
                count[s[start++]-'a']--;
            }
        }
        System.out.println("-1 -1");
    }

    private static int checkCount(int[] arr) {
        int max = 0;
        for(int i=0; i<26; i++) {
            max = Integer.max(max, arr[i]);
        }
        return max;
    }
}
