import java.util.ArrayList;
class Main9 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        System.out.println("ArrayList :" + animals);
        System.out.print("Accessing individual elements :");
        for (String temp : animals) {
            System.out.print(temp);
            System.out.print(",");
        }
    }
}
