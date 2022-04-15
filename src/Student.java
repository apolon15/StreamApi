import java.util.Collection;
import java.util.Map;

public class Student {
    private String name;
    private Map marks;
    private double avg;
    private String group;
    private int cours;

    public Map getMarks() {
        return marks;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    public Student(String name, Map marks, String group, int cours) {
        this.name = name;
        this.marks = marks;
        this.group=group;
        this.cours=cours;
        double sum = 0;
        Collection<Integer> values = marks.values();
        for (Integer num : values) {
            sum += num;
        }
        this.avg = sum / this.getMarks().size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(Map marks) {
        this.marks = marks;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return
                "Студент: " + name  +
                ", аттестат: " + marks +
                ", средний бал: " + avg +
                ", группа: " + group +
                ", курс: " + cours;
    }
}


