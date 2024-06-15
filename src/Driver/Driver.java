package Driver;

public class Driver {
    private String name;
    private int age;
    private int yearsOfExperience;

    public Driver(String name, int age, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
