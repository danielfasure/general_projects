package advance_java;

public class inner_class {
    int variable;

    public void show(){
        System.out.println("you are in the outer class ");
    }
    class inner_inner_class{
        public void show_inner(){
            System.out.println("you are in the inner class");
        }
    }

}
class demo {
    public static void main(String[] args) {
        inner_class showing = new inner_class();
        showing.show(); // this show that you can easily access the class method to access inner method you must create an object
        inner_class.inner_inner_class inner_inner_object = showing.new inner_inner_class(); // to use an inner class think of it as step in ladder of permission with the . being the break to the class
     //  inner_class.inner_inner_class inner_inner_object = new showing.inner_inner_class(); // this another way of creating access to the inner class but only work if inner class static
        inner_inner_object.show_inner();
    }
}
