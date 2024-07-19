import java.util.*;

public class HashMapConcept {
    static class HashMap<K, V> { // generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private LinkedList<Node> buckets[]; // N

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.size = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % size;
        }

        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){

                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // 0 to size-1
            int di = SearchInLL(key); //valid; -1
        }

        public boolean containsKey(K key){

        }
    }

    public static void main(String[] args) {
        // Create
        // HashMap<String, Integer> hm = new HashMap<>();

        // Insert - put
        // hm.put("India", 100);
        // hm.put("China", 150);
        // hm.put("US", 50);
        // hm.put("Nepal", 70);

        // Print
        // System.out.println(hm);

        // get
        // int population = hm.get("India");
        // System.out.println(population); //100
        // System.out.println(hm.get("Mumbai")); //null

        // ContainKey
        // System.out.println(hm.containsKey("India")); //true
        // System.out.println(hm.containsKey("Mumbai")); //false

        // Delete - remove
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // Size
        // System.out.println(hm.size());

        // IsEmpty
        // hm.clear();
        // System.out.println(hm.isEmpty()); //true bcoz of clear()

        // Iterate
        // Set<String> keys = hm.keySet();
        // System.out.println(keys);

        // for (String k : keys) {
        // System.out.println("key: "+k+", value: "+hm.get(k));
        // }
    }
}
