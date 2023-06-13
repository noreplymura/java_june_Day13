import java.util.*;
 class RollNumberDoesNotFitException extends Exception
{
    String msg;
    RollNumberDoesNotFitException(String msg) {
        super(msg);
        this.msg = msg;
    }
    @Override
    public String toString() {
        return msg;
    }
}
class Main21{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    try{
    if(age<18){
    throw new RollNumberDoesNotFitException("This  Roll number doesn't exist in  the required roll number list");
 }
} catch(
    RollNumberDoesNotFitException ex){
    //System.out.println(ex);
    System.out.println(ex.getMessage());
}
}
}

