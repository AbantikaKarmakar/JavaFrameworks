import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.Set;
// import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Rohan", 2));
        studentSet.add(new Student("Rohit", 10));
        studentSet.add(new Student("Shivam", 5));
        studentSet.add(new Student("Anuj", 6));
        studentSet.add(new Student("Rohan", 2)); // repetion possible
        // after setting equals() we can avoid

        System.out.println(studentSet);
        
        // Set<Integer> set = new HashSet<>(); // not in order O(1)
        // Set<Integer> set = new LinkedHashSet<>(); // in order 
        // Set<Integer> set = new TreeSet<>(); // sorted order O(log(n))

        // set.add(32);
        // set.add(2);
        // set.add(54);
        // set.add(21);
        // set.add(65);

        // set.add(54); // will not get added

        // System.out.println(set);
        // set.remove(54);
        // System.out.println(set);
        // System.out.println(set.contains(100));
        // System.out.println(set.isEmpty());
        // System.out.println(set.size());
        // set.clear();

    }
}
