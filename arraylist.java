import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list);
        
        //get

        int element = list.get(0);
        System.out.println(element);

        //add el in between

        list.add(1,1);
        System.out.println(list);

        //set element

        list.set(0,5);
        System.out.println(list);

        //delete
        list.remove(0);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println("remaining size is :-"+ size);

        //loops

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));

        }

        //sorting

        Collections.sort(list);
        System.out.println(list);





        
    }
}
