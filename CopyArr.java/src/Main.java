//copying an array into other
import java.lang.*;
class CopyArr{
    public static void main(String[] args) {
        int []A={1,2,3,4,5,6,7,8,9,10,11};
        int B[]=new int[11];
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" , ");
        }
        System.out.println(" ");
        for(int i =0;i<A.length;i++)
        {
            B[i]=A[i];
        //    System.out.print(B[i] + " , ");
        }
        for(int i =B.length-1;i>=0;i--)
        {
            System.out.print(B [i] +" , ");
        }
    }
    }