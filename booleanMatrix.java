import java.util.*;
class booleanMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("before");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        int row[]=new int[m];
        int col[]=new int[n];
        for(int i=0;i<m;i++){
            row[i]=0;
        }
        for(int j=0;j<n;j++){
            col[j]=0;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){ 
                if(row[i]==1||col[j]==1){
                    arr[i][j] = 1;
                } 
            } 
        }
        System.out.println("after");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }  
    }
}
