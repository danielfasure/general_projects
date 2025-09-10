package advance_java;

public class Understanding_lamda_expression {
    // used for functional interface can shorten code
    @FunctionalInterface
    interface A {
        void show();
    }
    interface B{
        int add(int j, int i);
    }


    public static void main(String[] args) {
    A ainterface = new A()
    {
        public void show() {
            System.out.println("in the show ");
        }
    }  ;
    //below is using lamda to create the functional interface
   A lamda_interface = ()->System.out.println("in a show ");   // with this no need to declare method and used new keyword only need ()

   // understanding how to do it with return
   B aintehr = new B(){
       public int add(int i , int j ){

           return i+j ;

       }

   } ;
aintehr.add(4,4);
        B ainterz = ( i ,  j )-> i+j ;




   ainterz.add(5,6);


    ainterface.show();
    }
}

