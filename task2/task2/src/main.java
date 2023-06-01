import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class main {
    public static void main(String []args){
        ArrayList<humane> list = new ArrayList<humane>();
        list.add(new humane(22, "Oleg", "Novikov", LocalDate.of(1999, 10,31), 63));
        list.add(new humane(20, "Kate", "Soldunova", LocalDate.of(2003, 2,11), 55));
        list.add(new humane(19, "Ulia", "Soldatenkova", LocalDate.of(2003, 5,31), 50));
        Stream<humane> stream1 = list.stream();
        System.out.println("Фильтрация по дате рождения большей чем 24 июня 2000: ");
        stream1.filter(i->i.birthDate.getYear() > 2000).forEach(System.out::println);
        System.out.println("Сортировка по имени: ");
        Stream<humane> stream2 = list.stream();
        stream2.sorted(Comparator.comparing(i->i.firstName)).forEach(System.out::println);
        System.out.println("Сумма всех возрастов: ");
        Stream<humane> stream3 = list.stream();
        int sum = stream3.mapToInt(i->i.age).sum();
        System.out.println(sum);
    }
}
