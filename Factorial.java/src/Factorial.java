class Factorial {
    // method creation
static    int fact(int n) {
         if(n==0 || n==1)
            return n;

        //recursion work to calculate fact(n-1) and fact(n-2)
     return  fact(n-1)+fact(n-2);

        // self work is add both fact(n-1) and fact(n-2)
    }
    public static void main(String... args){
    for(int i=0;i<10;i++)
        System.out.println("factorial of nth order" + fact(i));
    }
}