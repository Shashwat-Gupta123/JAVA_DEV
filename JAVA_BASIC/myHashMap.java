package JAVA_BASIC;
import java.util.HashMap;
import java.util.Map;
public class myHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer>m=new HashMap<>();
        m.put(1,10);
        m.put(2,20);
        m.put(3,30);
        m.put(4,40);
        m.put(5,50);
        
        //  Iterating over HAshMAP
        for(Map.Entry<Integer,Integer>x:m.entrySet()){
            int key=x.getKey();
            int value=x.getValue();
            System.out.println("KEy--> "+key+"\nVAlue is--> "+value);
        }

    }
}
