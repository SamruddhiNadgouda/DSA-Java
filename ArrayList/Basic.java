import java.util.ArrayList;

import javax.swing.text.html.parser.Element;

public class Basic {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // //Add element => O(1)
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // list.add(1, 9); // O(n)

        // System.out.println(list);

        // //Get element => O(1)
        // int element = list.get(2);
        // System.out.println(element);

        // //Remove element => O(n)
        // list.remove(2);
        // System.out.println(list);

        // //Set element at Index => O(n)
        // list.set(2, 10);
        // System.out.println(list);

        //Contain element => O(n)
        // System.out.println(list.contains(1)); //true 
        // System.out.println(list.contains(11)); //false

        //Size of All => .size()
        // System.out.println(list.size());

        // //Print the Arraylist
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        //Multi- Dimensional ArrayList
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();

        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // mainList.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();

        // list2.add(5);
        // list2.add(6);
        // list2.add(7);
        // mainList.add(list2);

        // for(int i=0; i<mainList.size();i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }

        // System.out.println(mainList);
        
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        //nested loop
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }

}