

    public static void main(String... args){
            Class PatternRect{
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.Println(" "+ "*");
        }
            System.out.println(" ");
        }}}
/*class Fibonacci{
    public static void main(String... args){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = s.nextInt();
        int n1=0;
        int n2=1;
        System.out.println(n1+ n2);
        Scanner sc= new Scanner(System.in);
        n =sc.nextInt();
        for(int i=2;i<n;i++){
            int fib=(i-1)+(i-2);
            System.out.println(fib);
        }
    }
}
/*class NeonNUmber{
    public static void main(String... args){
        Scanner s = new Scanner (System.in);
        System.out.println("enter number");
        int  n=s.nextInt();
        int sqarenum,digit,sum=0;
        sqarenum=n*n;
        while(sqarenum>0){
            digit=sqarenum%10;
            sum=sum+digit;
            sqarenum=sqarenum/10;
        }
        System.out.println("sum is"+ sum);
        if(sum==n) {
            System.out.println("Number is a  neon number");
        }
            else
        {
                System.out.println("number is not neon");
        }
    }
}

/*class Challenge {
    public static void main(String[] args) {
       int b =10111110;
       String str1="9A";
       String dob = "01/01/2002";
       String str =b+"";
       System.out.println(str.matches("[01]*"));
       System.out.println(str1.matches("[0-9A-F]+"));
     System.out.println(dob.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
      //  System.out.println(dob.matches("[0-30-9]/[0-10-9]/[0-9]{4}"));}
    }*/

