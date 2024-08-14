// create a method and call in static using static and using object creation
import java.lang.*;
class  MethodPractice {
/*  void max(int x){
   x++;
   System.out.println(x +" ");
    }
    public static void main(String[] args){
        int a=10,b=15,c;
        MethodPractice mp=new MethodPractice();
       mp.max(a);
        System.out.println(a);
        String[] Arr = {"Ranjeet", "Mauryar", "Anya", "Honey", "Anup"};
        java.util.Arrays.sort(Arr);
        for(String x :Arr) {
            System.out.println(x);*/
   static int mul(int x,int y){
        int c = x *y;
        return  c;
        }
        public static  void main (String[] args){
        int a =20, b =30,result;
        result =mul(a,b);
        System.out.println(result);

    }
}