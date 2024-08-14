//declaration and displaying  two dimension array
import java.lang.*;
 class TwodArr {
     public static void main(String[] args) {
         int[][] A = new int[3][4];
         int[] B[] = new int[3][];
         B[0] = new int[2];
         B[1] = new int[4];
         B[2] = new int[3];
         int C[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
         int[] D, F, G[];
         for (int i =0;i<C.length;i++)
         {
             for (int j=0;j<C[0].length;j++)
             {
                 System.out.print(C[i][j] +" , ");
             }
         }
         System.out.print("\n");
         for(int x[]:B)
         {
             for(int y:x)
             {
                 System.out.print(y +"  ");
             }

             System.out.println(" ");
         }
         for(int i =0;i<B.length;i++)
         {
             for(int j =0;j<B[i].length;j++)
             {
                 System.out.print(B[i][j] + " ");
             }
             System.out.println(" ");

         }
     }
 }