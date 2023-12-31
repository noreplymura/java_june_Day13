import java.util.*;
public class AgeDoesNotFitException extends Exception
{
    String msg;
    AgeDoesNotFitException(String msg) {
        super(msg);
        this.msg = msg;
    }
    @Override
    public String toString() {
        return msg;
    }
}
class Main{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    try{
    if(age<18){
    throw new AgeDoesNotFitException("Entered age doesn't fulfill the required age limit");
 }
} catch(
    AgeDoesNotFitException ex){
    System.out.println(ex);
    System.out.println(ex.getMessage());
}
}
}