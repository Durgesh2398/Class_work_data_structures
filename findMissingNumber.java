

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc =new Scanner(System.in);
		int times;
        times=sc.nextInt();
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
        }
	}
}
