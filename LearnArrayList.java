import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        // String[] studentsName = new String[30];
        // studentsName[0] = "Rakesh";
        // studentsName[29] = "Harish";
        // // New Student 
        // studentsName[30] = "Raman";

        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Rakesh");
        // size = n -> n+n/2+1
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);

        list.add(1, 50);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(3));
        list.remove(4);
        list.remove(Integer.valueOf(160));
        System.out.println(list);
        // list.clear(); // to remove all

        list.set(3, 1000);
        System.out.println(list);
        System.out.println(list.contains(150));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("The element is "+list.get(i));
        }

        for (Integer element: list) {
            System.out.println("Foreach element is "+element);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }

    }
}
