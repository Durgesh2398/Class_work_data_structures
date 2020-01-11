import java.util.*;
class Pattern{
    public static void print(int n){
        // if(n<=0){
        //     System.out.println(n +"   ");
        //     print(n+5);
        // }
        if(n>0){
            System.out.print(n +" ");
            print(n-5);
        }
         System.out.println(n);
    }
    public static void main(String[] args){
        int num =16;
        print(num);
        System.out.println("");
        int x= 10;
        print(x);
    }
}
