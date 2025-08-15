package main_package.Object_class;

public class Human extends Mammals{

   public void update (String name, int age){
      this.Name = name;
      this.Age = age;

    }

    @Override
    public String toString() {
        return "this "+ this.Name + " and the age is " + this.Age;
    }
}
