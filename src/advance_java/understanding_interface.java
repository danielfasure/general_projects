package advance_java;

public class understanding_interface {
}

interface Computer
{
 public void code();
}

class Laptop implements Computer{
   public void code(){
       System.out.println("latop resources are being used ");
   }
}
class Desktop implements Computer{

    public void code() {
        System.out.println("computer resources are being used ");
    }
}

class Developer{
    public void createAp(Laptop lap){
        lap.code();
        System.out.println("app is being created");
    }
}

class demo_interface{
    public static void main(String[] args) {
        Laptop newlaptop = new Laptop();
        Developer daniel = new Developer();
        daniel.createAp(newlaptop);
    }
}

