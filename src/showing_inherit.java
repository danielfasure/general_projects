public class showing_inherit {
    public static void main(String[] args) {
       Ford classic_vec = new Ford();
       classic_vec.CarMake = "ford fiestia";
       classic_vec.honk();



    }
}
class Car{
  String CarMake;
  int CarAge;
  int intial_value;
  int current_value;

    }

    class Ford extends Car{
    void honk (){
        System.out.println("your "+CarMake+" is honking ");

    }
    }


