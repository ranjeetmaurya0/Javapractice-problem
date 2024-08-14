/* random number Generation in java, in java are four method for random number generation
1. using Math.random();
2. Random class
3. used ThreadLocalRandom Class
4. using ints() Method
 */
// 1. random method we can set/ specify a certain range
/*import java.lang.Math;
class RandomNUmber{
    public static void main(String... args){
        int min = 10;
        int max = 50;
        System.out.println("Random number is "+ Math.random());
        System.out.println("Random number between specified Range is " +min+ "to" +max);
        int a = (int)(Math.random()* (max-min+1)+min);
        System.out.println(a);
    }
}*/
// random number generation through random class
import java.util.Random;
import java.util.Scanner;
 class RandomNumber{
    public static void main(String args[]) {
        Random random = new Random();int x = random.nextInt(50);    // 50 is the range between this the random number is generated
         int y = random.hashCode();
       //  int z = random.nextDouble();
         System.out.println(x );System.out.println(y );
     }
 }


// declaration of array
class Array {
    public static void mian(String args[]) {

        int[] arr = new int[20];
        arr[0]=20;   // fill the data into the array
        // for multiple data using for loop  to insert the data into array one by one
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array element");
        for(int i =1; i< arr.length-1;i++) {
            arr[i] = s.nextInt();
        }
            // in Declaration of 2D array do not need to define the size of column of array it can take automatically because an array can different column size
            int [][] nums = new int[5][];
            int [][] matrix = {{2,3,4},
                           {4,5},
                           {6,7,8,9}
            };
            // for different size of column we do not give the array.length when you insert the data in the array so we need to give the different size of
            // each iteration
            for(int row =0 ; row< nums.length-1; row++)
            {
               for ( int col=0; col < nums[row].length; col++ )
                {

                }
        }
    }
}

