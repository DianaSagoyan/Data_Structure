package collectionsReview;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class
        List<Student> students = new ArrayList<>();

        // Add elements to ArrayList
        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));

        // Iteration on ArrayLists
        // 1. For Loop with get(index)
        System.out.println("Printing with legacy for-loop");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        // 2. Iterator
        // Forward Iteration
        System.out.println("\nPrinting with iterator");
        Iterator iterator = students.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Backwards Iteration

        System.out.println("\nPrinting iterator backwards");
        while (((ListIterator<?>) iterator).hasPrevious()) {
            System.out.println(((ListIterator<?>) iterator).previous());
        }

        // 3. for each loop
        System.out.println("\nPrinting with for each");
        for (Student each : students) {
            System.out.println(each);
        }

        // 4. Lambda
        System.out.println("\nPrinting with lambda");
        students.forEach(student -> System.out.println(student));
        // Sorting Elements in List

        System.out.println("\nSorting with comparator interface by id in descending order");
        Collections.sort(students, new sortByIdDesc());
        students.forEach(student-> System.out.println(student));

        System.out.println("\nSorting with Comparator Interface by Name Desc......");
        Collections.sort(students, new sortByNameDesc());
        students.forEach(student-> System.out.println(student));
    }

    //implementation of Comparator

    public static class sortByIdDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getId() - o1.getId();
        }
    }

    public static class sortByNameDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getId() - o1.getId();
        }
    }
}
