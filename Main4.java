import java.util.List;
import java.util.LinkedList;
public class Main4 {
public static void main(String[] args) {
    List<Integer> numbers = new LinkedList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    System.out.println("List :" + numbers);
    int number = numbers.get(2);
    System.out.println("Accessed Element :" + number);
    int removedNumber = numbers.remove(1);
    System.out.println("Removed Element :"+removedNumber);
    System.out.println("List :"+number);
}
}
