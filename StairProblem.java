//Count ways to reach the nth stair using step 1, 2 or 3
import java.util.*; 
public class StairProblem{
	public static int findStep(int n){ 
		if (n == 1 || n == 0){ 
            return 1; 
        }
		else if (n == 2){ 
			return 2; 
        }
		else{
			return findStep(n - 3) + 
				findStep(n - 2) + 
                findStep(n - 1);
        }	 
	} 
	public static void main(String argc[]){ 
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(); 
		System.out.println(findStep(n)); 
	} 
} 
