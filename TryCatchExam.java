class TryCatchExam {
    public static void main(String[] args) {
        try{int data1=50/0;}
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
        System.out.println("Rest of the code....");
    }
}
