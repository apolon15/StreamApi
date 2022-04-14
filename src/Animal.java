public class Animal implements Comparable {
    private String name;
    private int age;
    private String monthBoth;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMonthBoth() {
        return monthBoth;
    }

    public void setMonthBoth(String monthBoth) {
        this.monthBoth = monthBoth;
    }

    public Animal(String name, int age, String monthBoth) {
        this.name = name;
        this.age = age;
        this.monthBoth = monthBoth;
    }

    @Override
    public String toString() {
        return "Животное: " +
                name +
                ", возраст: " + age + " лет " +
                ", месяц рождения: " + monthBoth + ".\n";
    }


    @Override
    public int compareTo(Object o) {
        Animal o1 = (Animal) o;
        return this.getName().compareTo(o1.getName());

    }
}
