// Rotation of array (left rotation)
//Right rotation of array
public class Main {
    public static void main(String[] args) {
    int [] Arr ={5,9,6,10,12,7,3,5,4,2};
    int temp,i;
  int  l =Arr.length;
   temp=Arr[l-1];
   for(i=0;i<l;i++)
   {
       System.out.println(Arr[i]);
   }
  /*  for(i=1;i<l;i++)
    {
       // temp =Arr[0];
        Arr[i-1]=Arr[i];
    }
    Arr[l-1] = temp;
    for (i =0;i<l;i++)
    {
        System.out.println(Arr[i]);
    }*/
       for(i=l-1;i>=1;i--)
       {
           Arr[i] =Arr[i-1];
       }
       Arr[0]=temp;
        for(i=0;i<l;i++) {
            System.out.println(Arr[i]);
        }
    }
}