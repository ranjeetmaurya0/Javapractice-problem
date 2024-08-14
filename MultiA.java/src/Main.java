// multiplication of two matrix
import java.lang.*;
class MultiA {
    public static void main(String[] args) {
        int[][] A = {{3, 5, 9}, {7, 6, 2}, {4, 3, 2}};
        int[][] B = {{1, 5, 2}, {6, 8, 4}, {3, 9, 2}};
        int[][] C = new int[A.length][B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] =C[i][j]+ A[i][k] * B[k][j];
                }
            }
        }
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }
    }
}