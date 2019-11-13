//time complexity of the array(O(m*n))
//we can implement binary search
//we can implement sort and search time complexity will be O(logn+logm)

import java.util.*;
public class subarray {
    static boolean subset_arrays(int arr1[], int arr2[],int n, int m){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr1[i]==arr2[j])
                {
                   break;
                }
                if (j == m){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println("Hello World!");
        int[] arr1 ={24,72,81,43,89,79};
        int[] arr2 ={72 , 43 , 79};
        int[] arr3 ={24 , 81 , 89 , 79};
        int[] arr4 ={24 , 81 , 89 , 79 , 93};
        int n=arr1.length;
        int m=arr2.length;
        int o=arr3.length;
        int p=arr4.length;
        System.out.println("size of array 1 "+n);
        System.out.println("size of array 2 "+m);
        System.out.println("size of array 3 "+o);
        System.out.println("size of array 4 "+p);
        if(subset_arrays(arr1,arr2,n,m))
        System.out.print("\nArray 2 is a subset of array 1\n");
        else
        System.out.print("\nArray 2 is not a subset of array 1\n");

    }
}