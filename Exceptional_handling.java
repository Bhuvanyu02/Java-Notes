public class Exceptional_handling {
    public static void main(String[]args){
        try{
           int a=50;
            int x=a/0;

        }
        catch(Exception e){
            System.out.println("Omphoo"+e);
        }
    }
}
