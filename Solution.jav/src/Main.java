// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     int [][] nums = new int[3][3];
     Scanner in = new Scanner(System.in);
     System.out.println("enter the value of array");
     for(int row=0;row<nums.length;row++)
     {
         for(int col = 0 ; col<nums[row].length;col++)
         {
             nums[row][col]= in.nextInt();
             System.out.print(nums[row][col] + " ");

         }
        System.out.println();
     }
     for (int row =0 ; row<nums.length; row ++){
         System.out.println(Arrays.toString(nums[row]));
     }
        }
    }
