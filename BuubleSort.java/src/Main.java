 class Sorting{
    /*int  bubbleSort(int arr[]){
        int n = arr.length-1;
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return 0;
    }*/
    /* int bubblesort2(int [] arr){
         int n = arr.length-1;
         for(int i=0;i<n;i++){
             for(int j=1;j<=n-i;j++){
                 if (arr[j] < arr[j-1]){
                     int temp = arr[j];
                     arr[j]=arr[j-1];
                     arr[j-1]=temp;

                 }
             }
         }
         return 0;
     }*/
     int selectionSort(int []arr){
         int n = arr.length-1;
         int target=arr[0];
         for(int i = 0;i<n;i++){
             int min_idx = i;
             for(int j=i+1;j<=n;j++){
             if(arr[i]>arr[j]){

             }
                 int temp = arr[j];
                 arr[j]=arr[i];
                 arr[i]=temp;
             }
         }
     }
    public static void main(String... args) {
        int[] arr = {5, 4, 3, 2, 1, 0};
        Sorting s = new Sorting();
        int n= arr.length-1;
        s.bubblesort2(arr);
        for (int i = 0; i<=n; i++) {
            System.out.println(arr[i]);
        }
    }
 }