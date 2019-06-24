import java.util.Objects;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/19$
 * @description 人$
 */
public class Person {

    private String name;
    private  Integer age;
    private  double salary;
    private Stauts stauts;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", stauts=" + stauts +
                '}';
    }

    public Person(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, Integer age, double salary, Stauts stauts) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.stauts = stauts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Double.compare(person.getSalary(), getSalary()) == 0 &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getAge(), person.getAge()) &&
                getStauts() == person.getStauts();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getSalary(), getStauts());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Stauts getStauts() {
        return stauts;
    }

    public void setStauts(Stauts stauts) {
        this.stauts = stauts;
    }

    public enum  Stauts{
        FREE,
        BUSY,
        VOCATION,

    }
}
