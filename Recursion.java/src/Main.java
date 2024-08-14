//import java.util.ArrayList;

/*class PrintNUm{
 /* static void  Number(int n){
        if(n>0) {
            Number(n - 1); // print the number 1 to n using recursion
            System.out.println(n);

System .out.println(n);
Number(n-1)     number n to 1
        }
        return;
    }
    public static void main(String... args){
      int n=10;
    }
 }
 class Reverse{
      static int reverseNumber(int n){
          if (n==0){
              return 0;
          }
          else{
              int digit = n%10;
              System.out.println(digit);
              return reverseNumber(n/10);
          }
      }
      public static void main(String... args){
          reverseNumber(1842);
      }
 }
  // count zero number
  // 1. method  we can passed count in parameter
 // 2.  in this method count or declare as instant variable
 /* class CountZero {
     static int zero(int number, int count) {
         if (number == 0) {
             return count;
         }
         int rem = number % 10;
         if (rem == 0) {
             return zero(number / 10, count + 1);
         }
         return zero(number / 10, count);
     }


      public static void main(String args[]){
              int n = 1020405;
              System.out.println("total number of zero's is " + zero(n,0));
      }
 }
// checking that the given array is sorted or not
 /* class Sorting {
     static boolean checkSorting(int[] arr, int index) {
         int n = arr.length - 1;
         if (n == index ) {
             return true;
         }
         // can ignore this line using whole return part
         else if(arr[index]>arr[index+1]){
             return false;
         }
             return  /* (arr[index] < arr[index + 1]checkSorting(arr, index + 1);

     }
     public static void main(String... args){
         int [] nums = {2,4,9,10,12,14};
       System.out.println(checkSorting(nums,0));
     }
 }*/
 /*class Solution {
     static boolean check(int[] nums) {
         return helper(nums,0);
     }
    static boolean helper(int []arr,int index){
         if(arr[index]< arr[index+1]){
             return helper(arr,index+1);
         }
         int p = index+1;
         if (arr[p-1]>arr[p+1]){
             return true;
         }
         return false;

     }
     public static void main(String args[]){
         int []arr  = {3,4,5,1,2};
         System.out.println(check(arr));
     }
 }
 class Searching{
    static  ArrayList<Integer> list = new ArrayList<>();
     static void findAllIndex(int[]arr, int target, int index){

         if(index == arr.length-1){
             return;
         }
         if(arr[index]== target){
             list.add(index);
         }
         findAllIndex(arr,target,index+1);

     }
     public static  void main(String[] args){
         int []nums={1,8,7,5,8,5,8,5,8,8,7,7,8,8,8,8,8,8,};
         findAllIndex(nums,8, 0);
         System.out.println(list);
     }
 }
class Searching {
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] < arr[m]) {
            if (target > arr[s] && target < arr[e]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }
        if (target < arr[e] && target > arr[m]) {
            return search(arr, target, m + 1, e);
        }

        return search(arr, target, s, m - 1);
    }

    public static void main(String... args) {
        int[] nums = {5, 6, 7, 1, 2, 3, 4, 5};
        int e = nums.length - 1;
        System.out.println(search(nums, 6, 0, e));
    }
}*/
// calculating the sum of digit
 class Recusion {
    static   int sumOfDigits(int n){
        if(n>=0 && n<=9) return n;
        return sumOfDigits(n/10)+n%10;
    }
    public static void main(String[] args){
        System.out.println(sumOfDigits(4231));
    }
}

