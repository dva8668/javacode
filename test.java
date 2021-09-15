package string;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test{
public static void main(String[] args) {
    Set<String>  set = new HashSet<>();
    set.add("Java");
    set.add("C++");
    set.add("PHP");
    set.add("Java");
    Iterator<String> itr = set.iterator();
    while(itr.hasNext()) {
        System.out.println(itr.next());
    }
    for(String abj : set) {
        System.out.println(abj);
    }
    ArrayList<String> listA = new ArrayList<String>();
    listA.addAll(set);
    System.out.println(listA);
    System.out.println(listA.get(2));
    System.out.println(listA.indexOf("C++"));
    Object[] Arr = listA.toArray();
    System.out.println(Arr[2]);
    System.out.println(listA.isEmpty());
    }
}