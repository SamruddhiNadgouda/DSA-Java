import java.util.ArrayList;
import java.util.Collections;

public class ArraylistQue {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp); 
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // //Reverse Print => O(n)
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        // //Find Maximum in an ArrayList
        // list.add(1);
        // list.add(9);
        // list.add(5);
        // list.add(6);
        // list.add(8);

        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
        //     // if(max < list.get(i)){
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println("Max element = "+max);

        //Swap Two Numbers
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        
        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        //Sort an Arraylist
        // System.out.println(list);
        // //Ascending order
        // Collections.sort(list);
        // System.out.println(list);

        // //Descending Order
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);
    }
}
