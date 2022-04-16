import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
/*
Дан ArrayList<Integer>. C помощью Stream Api найдите среднее арифметическое
 */
//        int cop = 6;
//        ArrayList<Integer> intMass = new ArrayList<>(cop);
//        while (intMass.size() != cop) {
//            intMass.add((int) (Math.random() * 51));
//        }
//        System.out.println(intMass);
//        Stream<Integer> stream = intMass.stream();
//        //   double AVG=
//        intMass.stream().mapToDouble(x -> x.doubleValue()).average().getAsDouble();
//        System.out.println(intMass.stream().mapToDouble(x -> x.doubleValue()).average().getAsDouble());
/*
Дан ArrayList<Double> с числами - 1 50 6 6 6 6 10 10 10. C помощью Stream Api найдите среднее
исключите повторяющиеся элементы из коллекции, отсортируйте и сохраните в Set.
 */
//        ArrayList<Double> listD = new ArrayList<Double>();
//        listD.add(6.0);
//        listD.add(10.0);
//        listD.add(50.0);
//        listD.add(6.0);
//        listD.add(10.0);
//        listD.add(6.0);
//        listD.add(10.0);
//        listD.add(10.0);
//        listD.add(1.0);
//
//        double num = listD.stream()
//                .mapToDouble(x -> x.doubleValue())
//                .average()
//                .getAsDouble();
//        System.out.println("***********");
//        System.out.println(num);
//        System.out.println("***********");
//        listD.stream().mapToDouble(x -> x.doubleValue()).sorted().distinct().forEach(num1 -> System.out.print(num1 + " "));
//        System.out.println("\n***********");
//
//        LinkedHashSet<Double> mySet = listD.stream()
//                .mapToDouble(x -> x.doubleValue())
//                .sorted()
//                .distinct().boxed().collect(Collectors.toCollection(LinkedHashSet::new));
//        System.out.println("***********");
//
//        System.out.println(mySet);

        /*
        2 Создать TreeSet содержащий класс Animal (поля - имя, кол-во лет, месяц рождения). Прибавить
всем животным, у которых месяц рождения апрель - 1 год. Распечатать содержимое с помощью for
each.
         */

//        TreeSet<Animal> animalsClass = new TreeSet<Animal>();
//        Animal a1 = new Animal("Лиса", 6, "январь");
//        Animal a2 = new Animal("Белка", 99, "апрель");
//        Animal a3 = new Animal("Ёжик", 1, "декабрь");
//        Animal a4 = new Animal("Конь", 99, "апрель");
//        Animal a5 = new Animal("Собака", 7, "май");
//        Animal a6 = new Animal("Жираф", 99, "апрель");
//
//
//        animalsClass.add(a1);
//        animalsClass.add(a2);
//        animalsClass.add(a3);
//        animalsClass.add(a4);
//        animalsClass.add(a5);
//        animalsClass.add(a6);
//        System.out.println(animalsClass);
//        animalsClass.stream()
//                .peek((x) -> x.getMonthBoth().equals("апрель")).peek(x -> x.setAge(x.getAge() + 1))
//                .forEach(x -> System.out.println(x));


/*
3 (выполнять не обязательно) Создайте HashMap, содержащий пары значений - имя игрушки и
объект игрушки (класс Product - поля: год выпуска, наименование). Исключить из коллекции
игрушки, произведенные до 2010 года. - любым способом, можно без stream.
 */

        HashMap<String, Product> myMap = new HashMap();
        Product p1 = new Product("самолет", 2012);
        Product p2 = new Product("паровоз", 2000);
        Product p3 = new Product("самосвал", 2004);
        Product p4 = new Product("кукла", 2018);
        Product p5 = new Product("пистолет", 2020);
        Product p6 = new Product("ракета", 2021);
        Product p7 = new Product("мяч", 2003);

        myMap.put("Летчик ", p1);
        myMap.put("Чух-чух ", p2);
        myMap.put("Ррррр ", p3);
        myMap.put("Маша ", p4);
        myMap.put("Макаров ", p5);
        myMap.put("Гагарин ", p6);
        myMap.put("Круглик ", p7);
        System.out.print(myMap);
        System.out.println("\nСобранная коллекция через цикл в печать");
        myMap.entrySet()
                .stream().filter(x -> x.getValue().getYear() > 2010)
                .forEach(x -> System.out.print(x + "; "));
        Map<String, Product> map2 =
                myMap.entrySet()
                        .stream().filter(x -> x.getValue().getYear() > 2010)
                        .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));

        System.out.println("\nСборная коллекция");
        System.out.println(map2);

 /*
 4 (выполнять не обязательно) Добавить студентов в коллекцию. Создать класс Student,
содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
Создать коллекцию, содержащую объекты класса Student.
Создать коллекцию с фио студентов, если средний балл>=3
А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе
  */

        Map<String, Integer> marksS1 = new TreeMap<String, Integer>();
        marksS1.put("Математика", 10);
        marksS1.put("Дипломатия", 10);
        marksS1.put("Культура", 10);
        marksS1.put("IT", 10);
        marksS1.put("История", 10);
        marksS1.put("Маркетинг", 5);

        Map<String, Integer> marksS2 = new TreeMap<String, Integer>();
        marksS2.put("Математика", 1);
        marksS2.put("Дипломатия", 2);
        marksS2.put("Культура", 3);
        marksS2.put("IT", 2);
        marksS2.put("История", 1);
        marksS2.put("Маркетинг", 1);

        Map<String, Integer> marksS3 = new TreeMap<String, Integer>();
        marksS3.put("Математика", 2);
        marksS3.put("Дипломатия", 1);
        marksS3.put("Культура", 2);
        marksS3.put("IT", 1);
        marksS3.put("История", 2);
        marksS3.put("Маркетинг", 1);

        Map<String, Integer> marksS4 = new TreeMap<String, Integer>();
        marksS4.put("Математика", 2);
        marksS4.put("Дипломатия", 10);
        marksS4.put("Культура", 10);
        marksS4.put("IT", 2);
        marksS4.put("История", 3);
        marksS4.put("Маркетинг", 10);

        Map<String, Integer> marksS5 = new TreeMap<String, Integer>();
        marksS5.put("Математика", 9);
        marksS5.put("Дипломатия", 9);
        marksS5.put("Культура", 5);
        marksS5.put("IT", 4);
        marksS5.put("История", 5);
        marksS5.put("Маркетинг", 5);

        Student s1 = new Student("Фредди Меркьюри", marksS1, "Робототехника", 4);
        Student s2 = new Student("Фредди Крюгер", marksS2, "Маркетинг", 2);
        Student s3 = new Student("Билл Хофман", marksS3, "Логистика", 3);
        Student s4 = new Student("Ангела Меркель", marksS4, "Туризм", 3);
        Student s5 = new Student("Элтон Джон", marksS5, "Финансы и бизнес", 1);

        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);
        listStudent.add(s4);
        listStudent.add(s5);
        List<String> sortStudent = new ArrayList<String>();
        System.out.println("\nИсходная коллекция студентов:\n");
        for (Student s : listStudent) {
            System.out.println(s);
            if (s.getAvg() >= 3) {
                sortStudent.add(s.getName());
            }
        }
        System.out.println("\nСтуденты со средним баллом более 3: \n");
        System.out.println(sortStudent);
        /*ПО Желанию
        0 Дан список целых чисел. Между двумя элементами одной чётности вставить число 0.
         */

        ArrayList<Integer> listNum = new ArrayList<Integer>(14);
        while (listNum.size() < 9) {
            listNum.add((int) (Math.random() * 50));
        }
        System.out.println(listNum);
        for (int i = 0; i < listNum.size() - 1; i++) {
            if (listNum.get(i) % 2 == 0 && listNum.get(i + 1) % 2 == 0 || listNum.get(i) % 2 != 0 && listNum.get(i + 1) % 2 != 0) {
                listNum.add(i + 1, 0);
                i++;
            }
        }
        System.out.println(listNum);

    }


}






