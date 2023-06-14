import java.util.Vector;
import java.util.Iterator;
class Main11 {
public static void main(String[] args) {
    Vector<String> animals = new Vector<>();
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Cow");
    String element = animals.get(2);
    System.out.println("Element at index 2 :" + element );
    Iterator<String> iterate = animals.Iterator();
    System.out.print("Vector :");
    while(iterate.hasNext()){
    System.out.print(iterate);
}  
}


