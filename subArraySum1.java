import java.util.*;
class subArraySum1 
{
	public static void main(String[] args) 
	{ 
		int arr[] = {15, 2, 4, 8, 9, 5, 20, -10, 23}; 
		int n = arr.length; 
        int sum = 10; 
        int curr_sum = arr[0], start = 0, i; 
		for (i = 1; i <= n; i++){ 
			while (curr_sum > sum && start < i-1){ 
				curr_sum = curr_sum - arr[start]; 
				start++; 
			} 
			if (curr_sum == sum){ 
				int p = i-1; 
                System.out.println(start + " and " + p); 
                break; 
			} 
	    	if (i < n){
                curr_sum = curr_sum + arr[i];
            }
            else{
		        System.out.println("No subarray found"); 
            }    
        }  
	} 
} 
