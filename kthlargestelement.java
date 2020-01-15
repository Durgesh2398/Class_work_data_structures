//we can do with heap and priority queue
import java.util.*;
public class kthlargestelment{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int time=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        while(time>0){
            int index=0;
            int temp=arr[0];
            int ar[]=new int[time-1];
            for(int i=0;i<m;i++){
                if(arr[i]>temp){
                    temp=arr[i];
                    index=i;
                }
            }
            System.out.println(temp);
            System.out.println(index);
            time--;
        }
    }
}
