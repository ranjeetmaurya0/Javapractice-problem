import java.util.Scanner;

// declaration of array
class Array {
    public static void mian(String args[]) {

        int[] arr = new int[20];
        arr[0]=20;   // fill the data into the array
        // for multiple data using for loop  to insert the data into array one by one
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array element");
        for(int i =1; i< arr.length-1;i++){
            arr[i]=s.nextInt();
        }
    }
}