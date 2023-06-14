import java.util.ArrayList;
class Main10 {
public static void main(String[] args) {
    ArrayList<String> langnages = new ArrayList<>();
    langnages.add("java");
    langnages.add("python");
    langnages.add("C++");
    langnages.add(2, "CSS");
    System.out.print("New Vector : " + langnages);
    ArrayList<String> animals = new ArrayList<>();
    animals.add("Dog");
    animals.addAll(langnages);
    System.out.print("New Vector : " + animals);
}  
}

