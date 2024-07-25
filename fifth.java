question 5:

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class five_25_7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        
        int[] arr = new int[n];

        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

  
        ArrayList<Integer> sam = new ArrayList<>();

      
        for (int i = 0; i < n; i++) {
            if (isp(arr[i])) {
                sam.add(arr[i]);
            }
        }

        
        Collections.sort(sam);

        
        int sum = 0;
        for (int j = 1; j < sam.size(); j++) {
            sum = sum + sam.get(j);
        }

      
        System.out.println("Sum of prime numbers (excluding the smallest prime): " + sum);

    public static boolean isp(int val) {
        if (val <= 1) return false;
        if (val == 2) return true;
        if (val % 2 == 0) return false;
        for (int i = 3; i * i <= val; i += 2) {  
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
}
