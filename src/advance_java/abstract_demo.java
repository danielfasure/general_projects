package advance_java;

  abstract class abstract_demo { // when dealing with abstract method you need abstract class
     public abstract void  method_abstract() ;// this method is abstract and nothing is defined no need for body tags



     void method_will_do_something(){
        System.out.println("this is working ");
    }
}
class abstracting extends abstract_demo  { //when inheriting and abstract method the child method must implement those methods

     public void method_abstract(){

     }
}

