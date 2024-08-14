interface Member{
   public  void Callback();
}
class Store {
    Member mem[] = new Member[100];
    int count =0;
    void register(Member m){
        mem [count++]= m;
    }
    void InviteSale(){
        for(int i =0;i<count;i++){
            mem[i].Callback();
        }
    }
}
class Customer implements Member {
    String name;

    Customer(String n) {
        name = n;
    }

    public void Callback() {
        System.out.println(name + "ok , I will visit Early");
    }
}


