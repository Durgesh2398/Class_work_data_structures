import java.util.*;
public class SpiralMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("befor");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("after");
        int k=0,l=0;
        int m=n;
        int nn=n;
        while (k < m && l < nn) { 
            for (int i = l; i < nn; i++) { 
                System.out.print(arr[k][i] + " "); 
            } 
            k++; 
            for (int i = k; i < m; i++) { 
                System.out.print(arr[i][nn - 1] + " "); 
            } 
            nn--; 
            if (k < m) { 
                for (int i = nn - 1; i >= l; i--) { 
                    System.out.print(arr[m - 1][i] + " "); 
                } 
                m--; 
            } 
            if (l < nn) { 
                for (int i = m - 1; i >= k; i--) { 
                    System.out.print(arr[i][l] + " "); 
                } 
                l++; 
            } 
        } 
    }
}
