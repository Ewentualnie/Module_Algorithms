import java.util.Comparator;

public class PersonCompare {
    public Comparator<Person> ageLower = (person1, person2) -> person2.getAge() - person1.getAge();
    public Comparator<Person> weightLower = (person1, person2) -> person2.getWeight() - person1.getWeight();
    public Comparator<Person> heightLower = (person1, person2) -> person2.getHeight() - person1.getHeight();
    public Comparator<Person> ageHigher = Comparator.comparingInt(Person::getAge);
    public Comparator<Person> weightHigher = Comparator.comparingInt(Person::getWeight);
    public Comparator<Person> heightHigher = Comparator.comparingInt(Person::getHeight);
}
