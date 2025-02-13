import java.util.LinkedHashMap;
import java.util.Map;

public class lruCachExample<K,V> extends LinkedHashMap<K,V> {
    int capacity;
    public lruCachExample(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {


        lruCachExample<String ,Integer> l=new lruCachExample<>(3);
        l.put("apple",10);
        l.put("mango",20);
        l.put("orange",5);
        l.get("apple");
        l.put("banana",1);

        System.out.println(l);

    }
}
