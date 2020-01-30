import java.util.*; 

class AntiSpiralMatrix { 
	
	public static void antiSpiralTraversal(int m, int n, int a[][]) 
	{ 
		int i, k = 0, l = 0; 
	
		Stack<Integer> stk=new Stack<Integer>(); 
	
		while (k <= m && l <= n) 
		{ 
			for (i = l; i <= n; ++i) 
				stk.push(a[k][i]); 
			k++; 
			for (i = k; i <= m; ++i) 
				stk.push(a[i][n]); 
			n--; 
			if ( k <= m) 
			{ 
				for (i = n; i >= l; --i) 
					stk.push(a[m][i]); 
				m--; 
			} 
			if (l <= n) 
			{ 
				for (i = m; i >= k; --i) 
					stk.push(a[i][l]); 
				l++; 
			} 
		} 
	
		while (!stk.empty()) 
		{ 
			System.out.print(stk.peek() + " "); 
			stk.pop(); 
		} 
	} 
  public static void main(String[] args) 
	{ 
  Scanner sc =new Scanner(System.in);
  int m=sc.nextInt();
  int n=sc.nextInt();
		int mat[][] = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        mat[i][j]=sc.nextInt();
      }
    }
			
		antiSpiralTraversal(mat.length - 1, mat[0].length - 1, mat); 
	} 
} 
