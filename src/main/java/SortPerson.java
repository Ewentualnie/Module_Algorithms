import java.util.Arrays;
import java.util.HashMap;

public class SortPerson {
    Person[] persons = new Person[]{
            new Person(150, 100, 20),
            new Person(150, 120, 20),
            new Person(150, 130, 20),
            new Person(150, 100, 20),
            new Person(150, 90, 20),
            new Person(150, 100, 20),
            new Person(160, 90, 20),
            new Person(150, 100, 20),
            new Person(100, 120, 20),
            new Person(150, 100, 20),
    };
    PersonCompare compare = new PersonCompare();

    public static void main(String[] args) {

        SortPerson sortPerson = new SortPerson();
//        for (int i = 0, j = 10, k = 20; i < 10; i++, j--, k++) {
//            Person person = new Person(i % 2 != 0 ? 150 : 160, 100, k);
//            sortPerson.persons[i] = person;
//        }
        //1
//        Arrays.sort(sortPerson.persons, sortPerson.compare.age);
//
//        //2
//        Arrays.sort(sortPerson.persons, sortPerson.compare.weight);
//        Arrays.sort(sortPerson.persons, sortPerson.compare.height);

        System.out.println("count " + sortPerson.getCountDifferentHeight(sortPerson.persons));
    }

    public int getCountDifferentHeight(Person[] people) {
        int count = 0;
        Person[] persons = new Person[people.length];
        System.arraycopy(people, 0, persons, 0, people.length);
        Arrays.sort(persons, compare.weight);

        return count;
    }
}