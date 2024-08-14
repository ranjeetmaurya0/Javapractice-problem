class TimeComplexity{
    public double Timetaken(double n){
        return n*(n+1)/2;
    }
   public int Timetaken(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            sum = sum+i;
        }
        return  sum;
    }
    public static  void main(String[] args){
        double now = System.currentTimeMillis();
        TimeComplexity t = new TimeComplexity();
        System.out.println(t.Timetaken(999999.52));
        System.out.println(t.Timetaken(999999));
        System.out.println("time - now" + (System.currentTimeMillis()-now) + "milisec");
    }
}