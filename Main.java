// MULTIPLE INHERITENCE USING INTERFACE
interface Hello{
    void display();
}
interface Hello1{
    void display1();
}
class derived implements Hello, Hello1{
    public void display(){
        System.out.println("Derived");
    }
    public void display1(){System.out.println("Derived d1");}
}
public class Main {
    public static void main(String[] args) {
derived d1=new derived();
d1.display();
d1.display1();


    }
}