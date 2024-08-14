import java.util.Arrays;
import java.util.Scanner;
class InsertElement {
   static void elementInsertion(int [] arr){
        int data= 4;
        int n= arr.length-1;
        int i=0;
        while(i<n){
            if(arr[i]< data){
                i++;
            }
            int p=i;

            createSpace(arr, p, n+1);
            arr[i]=data;
        }

    }
    static void createSpace(int []a,int start,int end){
        for(int i = 0; i > start;i++){
            a[i]=a[i+1];
        }
    }
    public static void main(String[] args){
       int [] array = new int [20];
       Scanner s = new Scanner();
       System.out.println("enter the element of array");
       for(int i)

       elementInsertion(array);
       System.out.println(Arrays.toString(array));

    }

}