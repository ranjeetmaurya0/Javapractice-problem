/*class PrimeNUm{
    static boolean isPrime(int n){
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public  static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int num = s.nextInt();
        System.out.println( isPrime(num));
    }
 class Circle {
    public double radius;

    public double Area() {
        return Math.PI * radius * radius;
    }

    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    public double Circumference() {
        return Perimeter();
    }
}
class Cylender extends Circle{
     public double height;
     public double Volume(){
         return Area()*height;
     }
}
class Circle1{
public static void main( String... args) {
    Cylender c1 = new Cylender();
    c1.radius=7;
    c1.height=10;
System.out.println(c1.Volume());
System.out.println(c1.Area());
System.out.println(c1.Perimeter());
}
}
 class Account{
     private long AccountNumber;
     public double Accountbalance;
     private String Address;
     private double Phone_no;
     private String D_O_B;

    public void setAccountNumber(long accountNumber) {
        if(accountNumber>0) {
            AccountNumber = accountNumber;
        }
        else {
            AccountNumber=0;
        }
    }
    public void setAddress(String address){
        Address=address;
    }
    public void  setPhone_no(double phoneNo){
        Phone_no=phoneNo;
    }
    public void setD_O_B(String dOB){
        D_O_B=dOB;
    }
    public double getAccountNumber(){
        return AccountNumber;
    }

    public double getPhone_no() {
        return Phone_no;
    }

    public String getAddress() {
        return Address;
    }

    public String getD_O_B() {
        return D_O_B;
    }
}
class SavingAccount extends Account {
     public double deposit;
     public double withdrawl;
     public  double AftrDepst(){
        return (Accountbalance+deposit);
     }
     public double AftrWtdrl(){
         return Accountbalance-withdrawl;
     }
}class LoanAccount extends Account{
     public double Money;
     public double Tmonth;
     public double Loan;
     public double PayEMIs(){
         return Money/Tmonth;
     }
     public double TopUpLoan(){
          return  Loan+Money;
     }
}
class Account1{
     public static void main(String... args){
         Account a=new Account();
         SavingAccount s1= new SavingAccount();
         LoanAccount l1= new LoanAccount();
         s1.deposit=1000;
         s1.withdrawl=500;
         l1.Loan=50000;
         l1.Money=80000;
         l1.Tmonth=24;
         a.Accountbalance=7000;
         a.AccountNumber=895339062;
         a.Phone_no(8526);
         l1.setAddress("haidarabad sikandarpur Basti");
         l1.setD_O_B("01/01/2002");
         System.out.println(" Accountnumber is" + s1.getAccountNumber()+ "Phone number is"+ s1.getPhone_no()+" Address is  "+s1.getAddress()+" date of birth" + s1.getD_O_B());
         System.out.println("Account balance after deposit"+s1.AftrDepst());
         System.out.println( "Account balance after wthdrawl"+ s1.AftrWtdrl());
         System.out.println(" EMI of per month"+ l1.PayEMIs());
         System.out.println("Loan upon loan is "+ l1.TopUpLoan());
     }
}*/
/*import java.lang.Math;
  class RandomVarriable
 {
     public static void main(String... args){
         int min=200;
         int max=400;
System.out.println("1st Random number"+ min +"to"+max+" :");
         double a=Math.random()*(max-min+1)+min;
System.out.println(a);
System.out.println("2nd random number"+ min+"to"+max+":");
        double b = Math.random()*(max-min+1)+min;
        System.out.print(b);
System.out.println("3rd Random number"+ min+"to"+max+":");
      double c=Math.random()*(max-min+1)+min;
      System.out.println(c);
     }
 }*/
 /*class StringFormatting{
    static String  reverseString(String str1){
         StringBuffer sb= new StringBuffer(str1);
         sb.reverse();
         return  sb.toString();
     }
     public static void main(String... args){
         System.out.println("reverse of string is " + reverseString("My name is ranjeet maurya"));
     }
}*/
/*class StringFormat {
    static String reverseofString(String str) {
        char []ch= str.toCharArray();
        int s = ch.length;
        String rev="";
        for(int i=s-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
public static void main(String... args){
        System.out.println(reverseofString("my name is ranjeet"));
    }
}*/
 // method of initilisation of object
// three method
// 1 . through reference
// 2. through method
// 3. through constructor
 /*/*class MethodIntilize{
     int length, bredth;
     int AreaofRectangle(){
         int Area= length* bredth;
         return Area;
     }
     public static void main(String... args){
         MethodIntilize mi= new MethodIntilize(12,20);
       //  mi.length=50; // through reference method
      //   mi.bredth=20;
         System.out.println(mi.AreaofRectangle());

     }
}*/
 /*class CeilingValue {
    int start, end;
    int target; 

    int binaryCiel(int arr[]) {
        int min; while (start<end){
        int mid = (start + (end - start)) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            return start = mid + 1;
        else
             min = arr[mid];
            for (int i = mid; i < end - 1; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }}return  min;}
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, 9, 11, 14, 16, 18};
        CeilingValue cv = new CeilingValue();
        cv.target=10;
        cv.start = 0;
        cv.end = arr.length;
        System.out.println("ceiling of target is " + cv.binaryCiel(arr));
    }
}*/
// Ceiling of a value
/*class CeilingValue{
    int ceil(int a[] ,int target) {
        int start =0;
        int end = a.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] > target)
                end = mid - 1;
          else if (a[mid] == target)
                return mid;
            else
                start = mid + 1;
        }
        return a[end];
    }
    public static void main(String args[])
    {
        int arr[] ={2,4,5,6,12,13,16,33,34,56,90,98};
        CeilingValue cv = new CeilingValue();
        int target=55;
        int result =cv.ceil(arr,target);
            System.out.println("number at index"+ result);

    }
}*/
// check if pair with given sum exist in array
//import java.lang.*;
/*class PairSum{
  static   boolean checkPair(int arr[],int x){
        int n = arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n; j++)
            {
                if(arr[i]+arr[j]==x)
                    return true;
            }
        }
        return  false;

    }
    public static void main(String... args){
        int arr[]={1,2,-4,3,5,6,7};
        System.out.println(checkPair(arr,0));
    }
}*/
// method using two pointer technique
//import java.util.*;
/*class Pairsum{
     static boolean checkPair(int arr[],int x){
        Arrays.sort(arr);
        int left,right;
        left=0;
        right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==x){
                return true;
            }
            else if(arr[left]+arr[right]>x) {
                right--;
            }
            else{
                left++;
            }
        }
        return  false;
    }
    public static void main(String args[]){
        int A[]={1,2,-4,3,5,6,7,8};
        System.out.println(checkPair(A,0));
        }
    }*/
/*class Searching {
    int index[] = new int[5];

    static char checkPosition(char[] letter, char target) {
        //int index[] = new int[5];
        int start = 0;
        int end = letter.length - 1;
        // int i=0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letter[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letter[(start% letter.length)];

    }
    public static void main(String args[]){
        char [] arr={ 'c','i', 'j'};
        System.out.println(checkPosition(arr,'d'));
    }
}*/
// find the position of target element in infinite sorted array
/*class BinarySearch{
    int findRange(int [] arr, int target){
        int start =0;
        int end =1;
        while(target > arr[end]){
            int newstart = end +1;
            end = end + (end - start +1)*2;
            start = newstart;
        }
        return Searchindex(arr, target , start, end);
    }
    int Searchindex(int arr[],int target, int start, int end){
                while(start <= end){
                        int mid = start + (end-start)/2;
                        if(arr[mid]>target)
                            end =mid-1;
                        else if(arr[mid]<target)
                            start = mid+1;
                        else
                            return mid;
                    }
                return -1;
            }
            public static void main(String... args){
                int a[]= {1,2,4,6,8,10,11,12,14,16,18,20,21,22,24,25,29,30,34,35,38,39,41,45,47,49};
                BinarySearch  bs = new BinarySearch();
                System.out.println("Target address is " +bs.findRange(a,24));
            }
        }*/
// apply binary search in 2 d sorted array a which is sorted in row and column wise
/* class  Solution{
 static  boolean SearcMatrix(int [][] matrix , int  target) {
     if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
         return false;
     }
     int m = matrix.length;
     int n = matrix[0].length;
     int start =0;
     int end  = m*n-1;
     while(start <= end){
         int mid = start + (end  - start )/2;
         int element = matrix[mid/n][mid%n];
         if(element == target) {
             return true;
         }
         else if (element > target) {
             end = mid - 1;
         }
         else{
             start = mid +1;

         }
     }
return false;
 }
    public static void main(String args[]) {
        int[][] array = {{1, 3, 5, 7}, {10, 11, 16, 20}, {20, 30, 34, 60}};
        System.out.println(SearcMatrix(array, 34));
        System .out.println(array.length);
    }
}*/
  //  find  peak in mountain array
/*class Solution{
    static int PeakElement(int [] arr ){
         int start = 0;
         int end= arr.length-1;
        int  peak = arr[0];
         while ( start<= end ){
             int mid = start + (end - start)/2;
                 if (arr[mid] > peak) {
                     peak =arr[mid];
                     start = mid + 1;
                 }
                  else {
                     end = mid - 1;
                 }

         }
         return 0;
         }
       // static int  BinarySearch(int [] arr , int peak){
      //  int target;
         public static void main(String args[]){
         int [] mountarr = {2,5,7,9,10,12,45,5,4,3,2,1};
         System.out.println(PeakElement(mountarr));

         }
         }*/
 // Search in rotated array
 // after some rotation  we need to find the pivot element which  separate the whole array in two parts
/*class Solution{
   static int BinarySearch(int [] arr) {
        int start = 0;
        int end =arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if ( arr[mid]>=arr[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
       return arr[start];
   }
    public static void main(String... args){
    int [] a = {7,9,1,2,3,5,6};
    System.out.println(BinarySearch(a));
    }
}*/
class Solution {
    static long binarySearch(int number) {
        long start = 0;
        long end = number;
        long ans = -1;

        while (start <= end) {

            long mid = start + (end - start) / 2;

            long Sqrtmid = (mid * mid);

            if (Sqrtmid == number) {
                return mid;
            } else if (Sqrtmid > number) {

                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;

            }
        }
        return ans;
    }
    public static void main(String... args){
        System.out.println(binarySearch(25));
    }
}



