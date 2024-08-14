
import java.lang.*;
import java.util.*;
 class Inserting {
    public static void main(String[] args) {
       int index, key,i;
       int  A[] =new int[10];
       A[0]=5;  A[1]=  12;  A[2]=4; A[3]=6;A[4]=20 ; A[5]=2 ;    A[6]= 9; A[7]=25;     A[8]=21;
       for(i=0;i<10;i++)
           System.out.println(A[i]);
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of index");
        index = scan.nextInt();
        System.out.println("enter the key");
        key = scan.nextInt();
        for (i=9;i>index;i--)
            A[i]=A[i-1];
              A[index]=key;
          for(i=0;i<10;i++)
            System.out.println(A[i]);


    }
}