/*import java.util.HashMap;
import java.util.LinkedHashMap;

class Hashmap{
    public static void main(String[] args){
   /*    HashMap <Integer , String>  map = new HashMap<>();
       map.put(100, "ranjeet");
       map.put(101, "shift");
       //System.out.println(map.entrySet());
       //System.out.println(map.get(100));
      // System.out.println(map.keySet());
       System.out.println(map.remove(102,"ranjeet"));
      // System.out.println(map.keySet());
        System.out.println(map.values());
        map.clear();
        LinkedHashMap<String , Integer> evennumber = new LinkedHashMap<String ,Integer>();

    }
}*/
// Weak hashmap
/* Weakhashmap is Hash Table based implemem=ntation of the  map interface , with the weak keys.
entry in weakhashmap will automatically be removed when its key is no longer in ordinary use .
Both null key and null values are supported .
This class  has performance characterstics similar to those of the HashMap class and has the same efficiency parameters of initial capacity and load factor.
 // WeakHashMap creation with capacity 8 and load factor 0.6
 WeakHashMap <key , values> number = new WeakHashMap<>(8,0.6);
           Method                                      Description
           clear()                   Remove all the entries from the map
           containsKey()            check if the map contains the specified key and  returns a boolean Value
           containsValue()          check if the map  contains the specified value and returns a boolean value
           size()                   Returns the size of the map
           isEmpty()                check if the map is empty and returns a boolean value
 */
import java.util.*;
 class WeakHashMap{
    public static void main(String[] args){
        WeakHashMap<String, Integer> numbers = new WeakHashMap<String, Integer>();
    }
}