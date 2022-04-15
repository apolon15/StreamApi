public class Product {
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Product(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return " наименование: " + name +
                ", год выпуска: " + year;
    }
}
