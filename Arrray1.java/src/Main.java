//find the maximum element from given array
//find the second maximum element from array
 // Searching the index of an element
import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] A = {3, 9, 7, 8, 12, 6, 15, 5, 4};
       int max1 =A[0];
       int max2 = A[0],i;
       for(i=0;i<A.length;i++){
           if(A[i]>max1){
           max2 =max1;
           max1 =A[i];
       }
           else if (A[i]>max2) {
               max2 = A[i];
           }
           }
           System.out.println(max2);
        }
    }

