import java.util.*;
import java.lang.*;
import java.io.*;
class missingNumber{
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		int times;
        times=sc.nextInt();
        while(times>0){
            int num=0;
            num=sc.nextInt();
            int number[] = new int[num];
            for(int i=1;i<num;i++)
            {
                number[i] =sc.nextInt();
            }
            int total = (num ) * (num +1) / 2; 
            for (int i = 0; i < num; i++) {
                total -= number[i];  
            }
            System.out.println(total);
            times--;
        }
        /*
        while(times-- >0){
            int num=0;
            num=sc.nextInt();
            int temp=0;
            int number;
            for(int i=1;i<num;i++)
            {
                number =sc.nextInt();
                temp=temp^number;
                temp=temp^i;
            }
            System.out.println(temp^num);
        }*/
	}
}
