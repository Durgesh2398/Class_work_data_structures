import java.util.*;
class zerosAndOnes { 
	public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int arr[] = new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        } 
        int n = arr.length;
        int count = 0;	
		for (int i = 0; i < n; i++) { 
			if (arr[i] == 0) 
				count++; 
		} 
		for (int i = 0; i < count; i++){ 
            arr[i] = 0; 
        }
		for (int i = count; i < n; i++){ 
            arr[i] = 1; 
        }
        System.out.print("Array after segregation is "); 
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i] + " ");	 
	} 
}
