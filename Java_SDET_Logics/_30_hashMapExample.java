import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _30_hashMapExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0, "hello");
        hm.put(1, "Gudbye");
        hm.put(42, "morning");
        hm.put(3, "evening");
        
        Set sn = hm.entrySet();
        Iterator it = sn.iterator();
        // hashtable -pass table set collections
        while (it.hasNext()) {
            Map.Entry mp = (Map.Entry) it.next();//
            System.out.println("the key is " + mp.getKey() + " and the value is " + mp.getValue());
        }

    }
}