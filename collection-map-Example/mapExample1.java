import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapExample1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"aashish");
        map.put(2,"puja");
        map.put(3,"ranjan");
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("puja"));
        System.out.println(map);
        String s= String.valueOf(map.size());
        System.out.println(s);
        Set<Integer> value = map.keySet();
        for (int i:value){
            System.out.println("using keySet method "+map.get(i));
        }
        Set<Map.Entry<Integer, String>> res = map.entrySet();
        for(Map.Entry<Integer,String > val:res){
            System.out.println("using getkey() and getvalue() "+val.getKey()+" :"+val.getValue());
        }
        for (Map.Entry<Integer,String> entery:res){
            System.out.println(entery.getKey()+" : "+entery.getValue().toUpperCase());
        }


    }
}
