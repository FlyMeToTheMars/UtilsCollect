import java.util.HashMap;

/**
 * @Author Fly.Hugh
 * @Date 2020/7/9 3:35 下午
 * @Version 1.0
 **/
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap();
        hashmap.put(1,"gogo");
        hashmap.put(2,"wade");
        hashmap.put(3,"james");
        hashmap.put(4,"curry");
        for(int key: hashmap.keySet()){
            System.out.println("key: "+ key + "; value: " + hashmap.get(key));
        }
    }
}
