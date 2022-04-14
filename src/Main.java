import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
/*
Дан ArrayList<Integer>. C помощью Stream Api найдите среднее арифметическое
 */
        int cop = 6;
        ArrayList<Integer> intMass = new ArrayList<>(cop);
        while (intMass.size() != cop) {
            intMass.add((int) (Math.random() * 51));
        }
        System.out.println(intMass);
        Stream<Integer> stream = intMass.stream();
        //   double AVG=
        intMass.stream().mapToDouble(x -> x.doubleValue()).average().getAsDouble();
        System.out.println(intMass.stream().mapToDouble(x -> x.doubleValue()).average().getAsDouble());
/*
Дан ArrayList<Double> с числами - 1 50 6 6 6 6 10 10 10. C помощью Stream Api найдите среднее
исключите повторяющиеся элементы из коллекции, отсортируйте и сохраните в Set.
 */
        ArrayList<Double> listD = new ArrayList<Double>();
        listD.add(6.0);
        listD.add(10.0);
        listD.add(50.0);
        listD.add(6.0);
        listD.add(10.0);
        listD.add(6.0);
        listD.add(10.0);
        listD.add(10.0);
        listD.add(1.0);

        double num = listD.stream()
                .mapToDouble(x -> x.doubleValue())
                .average()
                .getAsDouble();
        System.out.println("***********");
        System.out.println(num);
        System.out.println("***********");
        listD.stream().mapToDouble(x -> x.doubleValue()).sorted().distinct().forEach(num1 -> System.out.print(num1 + " "));
        System.out.println("\n***********");

        LinkedHashSet<Double> mySet = listD.stream()
                .mapToDouble(x -> x.doubleValue())
                .sorted()
                .distinct().boxed().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("***********");

        System.out.println(mySet);

        /*
        2 Создать TreeSet содержащий класс Animal (поля - имя, кол-во лет, месяц рождения). Прибавить
всем животным, у которых месяц рождения апрель - 1 год. Распечатать содержимое с помощью for
each.
         */

        TreeSet<Animal> animalsClass = new TreeSet<Animal>();
        Animal a1 = new Animal("Лиса", 6, "январь");
        Animal a2 = new Animal("Белка", 99, "апрель");
        Animal a3 = new Animal("Ёжик", 1, "декабрь");
        Animal a4 = new Animal("Конь", 99, "апрель");
        Animal a5 = new Animal("Собака", 7, "май");
        Animal a6 = new Animal("Жираф", 99, "апрель");


        animalsClass.add(a1);
        animalsClass.add(a2);
        animalsClass.add(a3);
        animalsClass.add(a4);
        animalsClass.add(a5);
        animalsClass.add(a6);
        System.out.println(animalsClass);
        animalsClass.stream()
                .peek((x) -> x.getMonthBoth().equals("апрель")).peek(x->x.setAge(x.getAge() + 1))
                .forEach(x -> System.out.println(x));
    }








}
