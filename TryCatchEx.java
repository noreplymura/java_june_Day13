 class TryCatchEx {
    public static void main(String[] args) {
        int i = 50;
        int j = 0;
        int data;
        try{
            data=i/j;
        }  catch (Exception e) {
    System.out.println("Error: " + i/(j+2));
        }
    }
}
