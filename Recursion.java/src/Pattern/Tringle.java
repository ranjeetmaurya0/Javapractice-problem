
/*    * * * *
      * * *
      * *
      *
*/
package Pattern;
public class Tringle {
    static void pattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            // System.out.print(" * ");
            pattern(row, col + 1);

            System.out.print(" * ");
        } else {
           // System.out.println();
            pattern(row - 1, 0);
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern(4, 0);
    }
}
/*static void BubbleSort(int []arr, int r , int c){
    if(r==0){
        return;
    }
    if(c<r){
    if(arr[c]>arr[c+1]) {
        int temp = arr[c];
        arr[c] = arr[c + 1];
        arr[c + 1] = temp;
    }
        BubbleSort(arr,r,c+1);
    }
    else{
        BubbleSort(arr,r-1,0);
    }
}
public static void main(String... args){
    int [] nums ={4,3,2,1};
    BubbleSort(nums, nums.length-1,0);
    System.out.println(Arrays.toString(nums));
}
}*/
/* static void BubbleSort(int []arr,int i, int j){
    if(i==arr.length-1){
        return;
    }
    int len= arr.length-1;
    if(j<len-i){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        BubbleSort(arr,i,j+1);
    }
    else{
        BubbleSort(arr,i+1,0);
    }
}
public static void main(String... args)
{
    int num[] = {2,1,4,3};
      BubbleSort(num,0,0);
    System.out.println(Arrays.toString(num));
}}*/
/*static void SelSort(int [] arr, int i, int j) {
    if (i == arr.length - 1) {
        return;
    }
    if (j > arr.length - 1 - i) {

        if (arr[0] < arr[j])
            temp = arr[0];
        arr[0] = arr[j];
        arr[j] = temp;
    } else {
        SelSort(arr, i, j + 1);
        arr[arr.length - 1 - i] = arr[0];
        SelSort(arr, i + 1, 1);
    }
}
public static void main(String[] args){
    int nums[]={4,3,2,8,1};
    SelSort(nums,0,1);
    System.out.println(Arrays.toString(nums));
}
}*/


