package leet_code;

import org.junit.Test;

import java.util.*;

public class CollectionTest {


    @Test
    public void test1(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(false);
        collection.add(new Day01("Jerry",20));

        boolean contains = collection.contains(123);
        System.out.println(contains);

        System.out.println(collection);

        collection.remove(456);
        System.out.println(collection);

        collection.remove(new String("Tom"));
        System.out.println(collection);

        Object[] arr = collection.toArray();
        for (Object i : arr) {
            System.out.println(i);
        }

        Iterator iterator = collection.iterator();

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        // System.out.println(iterator.next());
        //System.out.println(iterator.next());

//        for (int i = 0;i <collection.size();i++){
//            System.out.println(iterator.next());
//        }
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

       // LinkedList list = new LinkedList();
        System.out.println("=============");

    }

//    public void testListRemove(){
//        List list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        updateList(list);
//        System.out.println(list);
//    }
//    private void updateList(List list){
//        list.remove(new Integer(2));
//        list.remove(2);
//    }

}
