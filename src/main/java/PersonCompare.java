import java.util.Comparator;

public class PersonCompare {
    public Comparator<Person> age = (person1, person2) -> person2.getAge() - person1.getAge();
    public Comparator<Person> weight = (person1, person2) -> person2.getWeight() - person1.getWeight();
    public Comparator<Person> height = (person1, person2) -> person2.getHeight() - person1.getHeight();
}
