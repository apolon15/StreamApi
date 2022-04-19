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

//        HashMap<String, Product> myMap = new HashMap();
//        Product p1 = new Product("самолет", 2012);
//        Product p2 = new Product("паровоз", 2000);
//        Product p3 = new Product("самосвал", 2004);
//        Product p4 = new Product("кукла", 2018);
//        Product p5 = new Product("пистолет", 2020);
//        Product p6 = new Product("ракета", 2021);
//        Product p7 = new Product("мяч", 2003);
//
//        myMap.put("Летчик ", p1);
//        myMap.put("Чух-чух ", p2);
//        myMap.put("Ррррр ", p3);
//        myMap.put("Маша ", p4);
//        myMap.put("Макаров ", p5);
//        myMap.put("Гагарин ", p6);
//        myMap.put("Круглик ", p7);
//        System.out.print(myMap);
//        System.out.println("\nСобранная коллекция через цикл в печать");
//        myMap.entrySet()
//                .stream().filter(x -> x.getValue().getYear() > 2010)
//                .forEach(x -> System.out.print(x + "; "));
//        Map<String, Product> map2 =
//                myMap.entrySet()
//                        .stream().filter(x -> x.getValue().getYear() > 2010)
//                        .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
//
//        System.out.println("\nСборная коллекция");
//        System.out.println(map2);

 /*
 4 (выполнять не обязательно) Добавить студентов в коллекцию. Создать класс Student,
содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
Создать коллекцию, содержащую объекты класса Student.
Создать коллекцию с фио студентов, если средний балл>=3

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
        System.out.println(sortStudent);
        System.out.println("************");
        System.out.println("\nСтуденты со средним баллом более 3: \n");
        Map<Object,Object> list1=listStudent.stream().
                filter(x->x.getAvg()>3)
                .collect(Collectors.toMap(k->k.getName(),v->v.getCours()));
        System.out.println(list1.keySet());

        /*ПО Желанию
        0 Дан список целых чисел. Между двумя элементами одной чётности вставить число 0.
         */

//        ArrayList<Integer> listNum = new ArrayList<Integer>(14);
//        while (listNum.size() < 9) {
//            listNum.add((int) (Math.random() * 50));
//        }
//        System.out.println(listNum);
//        System.out.println("***********");
//        for (int i = 0; i < listNum.size() - 1; i++) {
//            if (listNum.get(i) % 2 == 0 && listNum.get(i + 1) % 2 == 0 || listNum.get(i) % 2 != 0 && listNum.get(i + 1) % 2 != 0) {
//                listNum.add(i + 1, 0);
//                i++;
//            }
//        }
//        System.out.println(listNum);
//        System.out.println("***********");

        /*
        1 Дан список целых чисел (ArrayList<Integer>). Удалить из него все числа, делящиеся на первый элемент.
         */
//        ArrayList<Integer> listNum2 = new ArrayList<Integer>(20);
//        while (listNum2.size() < 20) {
//            listNum2.add((int) (Math.random() * 50));
//            if (listNum2.get(0) == 0 || listNum2.get(0) == 1) {
//                listNum2.set(0, (int) (Math.random() * 20));
//            }
//        }
//        System.out.println(listNum2);
//        System.out.println("***");
//        int indexList = 0;
//        LinkedList<Integer> delNum = new LinkedList<>();
//        for (int i = 1; i < listNum2.size() - 1; i++) {
//            if (listNum2.get(i) % listNum2.get(0) == 0) {
//                delNum.add(listNum2.get(i));
//                listNum2.remove(i);
//            }
//        }
//        System.out.println(listNum2);
//        System.out.println("удаленные числа " + delNum);


        /*
2 Генерируется длинный (20 элементов) список случайных целых чисел.
Выполняется проход по списку- добавить единицу всем элементам списка,
которые делятся без остатка на первый элемент.
         */
//        LinkedList<Integer> listNum3 = new LinkedList<Integer>();
//        while (listNum3.size() < 20) {
//            listNum3.add((int) (Math.random() * 50));
//            if(listNum3.get(0)<2){
//                listNum3.set(0,(int)(Math.random()*20)+2);
//            }
//        }System.out.println(listNum3);
//        for(int i=1;i<=listNum3.size()-1;i++){
//            if(listNum3.get(i)%listNum3.get(0)==0){
//                listNum3.set(i,listNum3.get(i)+1);
//            }
//        }System.out.println("***");
//        System.out.println(listNum3);

        /*  3 Дана коллекция слов. Найти самое часто встречающееся слово.
         */
//        ArrayList<String>mStr=new ArrayList<>();
//        mStr.add("один");
//        mStr.add("один");
//        mStr.add("три");
//        mStr.add("один");
//        mStr.add("два");
//        mStr.add("один");
//        mStr.add("девять");
//        mStr.add("три");
//        mStr.add("один");
//        mStr.add("три");
//        mStr.add("один");
//        mStr.add("два");
//        mStr.add("три");
//        mStr.add("один");
//        mStr.add("два");
//        mStr.add("один");
//        mStr.add("девять");
//        mStr.add("три");
//        mStr.add("пять");
//        mStr.add("шесть");
//        mStr.add("пять");
//        int max=0;
//        String find=null;
//        int count=0;
//        Collections.sort(mStr);
//        System.out.println(mStr);
//        for(int i=0;i<=mStr.size()-1;i++){//d цикле нахожу кол-во посторений.Если найдено более чем MAX-перезаписываю
//            String tmp=mStr.get(i);
//            count=(mStr.lastIndexOf(tmp)+1)-i;
//            if(count>max){
//                max=count;
//                find=tmp;
//                i=count-1;
//                count=0;
//            }
//        }
//        System.out.println("Слово "+find+" "+max+" раз");

        /*4 Дана коллекция HashMap. Ключ - ФИО, значение - номер телефона. Организовать поиск ФИО по номеру телефона
         */
//        Map<String, String> hm = new HashMap();
//        hm.put("Иванова", "222388");
//        hm.put("Суривонич", "123458");
//        hm.put("Левашин", "9877680");
//        hm.put("Покровский", "11128");
//        hm.put("Жданов", "75438");
//        hm.put("Каршин", "9394864");
//        hm.put("Иванова", "7788");
//        hm.put("Сидорова", "774388");
//        System.out.println("Введи номер тел: ");
//        Scanner sc = new Scanner(System.in);
//        String userNum = sc.next();
//        System.out.println("Найдены варианты: ");
//        for (Map.Entry<String, String> entr : hm.entrySet()) {
//            if (entr.toString().contains(userNum)) {
//                System.out.println(entr.getKey());
//            }
//        }

/*
  5 Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap.
  */
        String string = ("Ночь, улица, фонарь, аптека, бессмысленный и тусклый свет. Живи ещё хоть четверть века — всё будет так. Исхода нет. Умрёшь — начнёшь опять сначала и повторится всё, как встарь: ночь, ледяная рябь канала, аптека, улица, фонарь. ");
        String lowC = string.toLowerCase();//преобразовал в ниж.рег
        String[] words = lowC.split("\\s|\\. |, |: |- |-");//поместил в массив
        for (int i = 0; i < words.length; i++) {//проверил на всё что не слова
            if (!Character.isLetter(words[i].charAt(0))) {
                words[i] = "";//заменил
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (String s : words) {//слова поместил в новый лист
            if (!s.equals("")) {
                list.add(s);
            }
        }
        System.out.print(list);//печать
        Collections.sort(list);//сортировка
        System.out.println("\n" + list);//печать
        HashMap<String, Integer> mapWords = new HashMap<>();
        int count = 0;
        for (int i = 0; i <= list.size() - 1; i++) {//в цикле нахожу по отсортированныйм словам кол-во повторений и кладу в Map<Слово,кол-во посторений>
            String find = list.get(i);
            count = (list.lastIndexOf(find) + 1) - i;
            mapWords.put(find, count);
            System.out.println("Слово \"" + find + "\" " + count + " раз");
            i = list.lastIndexOf(find);
            count = 0;
        }
        System.out.println(mapWords.get("аптека"));

/*
6 Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for.

 */


        Iterator<Map.Entry<String, Integer>> it = mapWords.entrySet().iterator();
        while (it.hasNext()) {
         String text=it.next().getKey();
            System.out.println("Длинна слова \"" + text + "\" равна " +
                    text.length());
        }
    }
}








