/*import java.util.Arrays;

 /* class MergeSort {
      static int[] mergeSort(int[] arr) {
          if (arr.length == 1) {
              return arr;
          }
          int mid = arr.length / 2;
          int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
          int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
          return merge(left, right);
      }


      private static int[] merge(int[] first, int[] second) {
          int[] temp = new int[first.length + second.length];
          int i = 0;
          int j = 0;
          int k = 0;
          while (i < first.length && j < second.length) {
              if (first[i] < second[j]) {
                  temp[k] = first[i];
                  i++;
              } else {
                  temp[k] = second[j];
                  j++;
              }
              k++;
          }
          while (i < first.length) {
              temp[k] = first[i];
              i++;
              k++;
          }
          while (j < second.length) {
              temp[k] = second[j];
              j++;
              k++;
          }
          return temp;
      }

      public static void main(String[] args) {
          int[] nums = {4, 6, 2, 1, 4, 5, 8, 6, 9,};
         int [] num = mergeSort(nums);
          System.out.println(Arrays.toString(nums));
      }

  }*/
/*class Removela {
     /*static void Skip(String p, String up) {
         if (up.isEmpty()) {
             System.out.println(p);
             return;
         }
         char ch = up.charAt(0);
         if (ch == 'a') {
             Skip(p, up.substring(1));
         } else {
             Skip(p + ch, up.substring(1));
         }
     }*/
    /* static String Skip(String up) {
         if (up.isEmpty()) {
             return " ";
         }
         char ch = up.charAt(0);
         if (ch == 'a') {
            return Skip(up.substring(1));
         }
         else {
          return   ch + Skip( up.substring(1));
         }
     }

     public static void main(String... args) {
         System.out.println(Skip("bccabh"));
     }
 }*/
 /*/*static void Subset(char [] arr){
     int i,j;
 for( i=0;i<arr.length;i++) {
     char sub = arr[i];
     System.out.println(sub);
     for ( j = i + 1; j < arr.length; j++) {
         System.out.print((sub + arr[j]));
     }
 }
 System.out.println(Arrays.toString(arr));
 }
 public static void main(String... args){
     char [] nums = {'a','b','c'};
     Subset(nums);
 }
 }*/
class Sum {
   static int  Addition(int m, int n){
        int i, sum1=0, sum2 =0;
        for(i=1;i<=m; i++){
            if(i%n==0){
                sum1+= i;
            }
            else{
                sum2+=i;
            }
        }
        return (sum1-sum2);


    }
}
 class Main{
    public static void main(String... args){
        Sum s = new Sum();
      System.out.println( s.Addition(4,2));
    }
 }