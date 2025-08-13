package main_package;

import java.util.Scanner;

class human {
    public int age ;
    public String name ;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isadult(int age ){
        if (age >= 18){
            return true;
        }
        return false;

    }
}



public class understanding_object {
    public static void main(String[] args) {
        System.out.println("what is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("what is your age? ");
        int age = sc.nextInt();

        human obj = new human();
        obj.setAge(age);
        obj.setName(name);
        System.out.println("thank you "+obj.getName()+ " and your age is "+obj.getAge());
        if (obj.isadult(age)){
            System.out.print(" you an adult would you like to advance");
        }
        else{
            System.out.println("you are too young to advance so sad");
        }

    }

}
