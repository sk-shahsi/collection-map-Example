import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap(10,03f,true);
        linkedHashMap.put("Apple",10);
        linkedHashMap.put("Banana",20);
        linkedHashMap.put("mango",5);
        linkedHashMap.put("orange",1);
        linkedHashMap.get("mango");
        System.out.println("directaly printing "+linkedHashMap);
        for (Map.Entry<String ,Integer> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getValue()+" "+entry.getKey());
            //directaly printing {Apple=10, Banana=20, mango=5, orange=1}
            //10 Apple
           // 20 Banana
            //5 mango
            //1 orange
            //After using accessOrder True
            //then the access value is came in to last.

        }

    }
}
