import java.util.Scanner;

public class MinimumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        countSubArray(n,arr,k);
    }

    static void countSubArray(int n, int[] arr,int k){
        // Write your code here 
        int count = 0; 
  
        for (int i = 0; i < n; i++) { 
            int sum = 0; 
            for (int j = i; j < n; j++) { 
  
                if (sum + arr[j] < k) { 
                    sum = arr[j] + sum; 
                    count++; 
                } 
                else { 
                    break; 
                } 
            } 
        } 
        System.out.println(count);
    }
}
