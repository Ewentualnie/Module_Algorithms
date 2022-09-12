import java.util.Arrays;

public class SortPerson {
    Person[] people = new Person[]{
            new Person(90, 100, 20),
            new Person(150, 120, 20),
            new Person(150, 130, 20),
            new Person(150, 100, 20),
            new Person(150, 90, 20),
            new Person(150, 100, 20),
            new Person(160, 90, 20),
            new Person(90, 100, 20),
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


//        1 First solution
        Arrays.sort(sortPerson.people, sortPerson.compare.ageLower);
//        Arrays.sort(sortPerson.people, sortPerson.compare.ageHigher);

//        2 second solution
        Arrays.sort(sortPerson.people, sortPerson.compare.weightLower);
//        Arrays.sort(sortPerson.people, sortPerson.compare.weightHigher);

        Arrays.sort(sortPerson.people, sortPerson.compare.heightLower);
//        Arrays.sort(sortPerson.people, sortPerson.compare.heightHigher);

//        3 third solution, я вважаю що мій метод підрахунку виражається в розрахунку (2n)
        System.out.println("count " + sortPerson.getCountHeight(sortPerson.people));
    }

    public int getCountHeight(Person[] people) {
        int count = 0;
        Person[] persons = new Person[people.length];
        System.arraycopy(people, 0, persons, 0, people.length);
        Arrays.sort(persons, compare.weightHigher);
        for (int i = 0; i < persons.length; i++) {
            int midCount = 0;

            int subArrayLength = getLength(persons, i);

            if (subArrayLength != 0) {
                midCount = getCount(persons, i, subArrayLength);
                i += midCount;
            }
            count += midCount;
        }
        return count;
    }

    private int getLength(Person[] persons, int start) {
        int end = start;
        while (persons[start].getWeight() == persons[end].getWeight() &&
                start < persons.length - 1) {
            end++;
        }
        return end - start;
    }

    private int getCount(Person[] persons, int startPos, int length) {
        Person[] midArr = new Person[length];
        System.arraycopy(persons, startPos, midArr, 0, length);
        Arrays.sort(midArr, compare.heightHigher);

        int count = 0;
        int height = midArr[0].getHeight();

        for (Person person : midArr) {
            if (person.getHeight() != height) {
                height = person.getHeight();
                count++;
            }
        }
        return count;
    }
}
