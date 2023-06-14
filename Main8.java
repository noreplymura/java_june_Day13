import java.util.ArrayList;
class Main8 {
public static void main(String[] args) {
    ArrayList<String> langnages = new ArrayList<>();
    langnages.add("Cat"); langnages.add("Dog"); langnages.add("Cow");
    System.out.println("ArrayList :" + langnages );
    langnages.set(2, "javaScript");
    System.out.print("Element at index 1: " + langnages);
}  
}

