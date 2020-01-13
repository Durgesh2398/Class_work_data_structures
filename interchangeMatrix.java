import java.util.*;
class interchangeMatrix{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("before");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        for(int i=0;i<m;i++){
                int temp=arr[i][0];
                arr[i][0]=arr[i][n-1];
                arr[i][n-1]=temp;
        }
        System.out.println("after");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
