package main_package;

import main_package.Object_class.Human;

public class understanding_loops {

    public static void main(String[] args) {
        int count = 0;
    //  basic for loop

        /*
     int count = 0;
        for(int i = 0 ; i<10;i++){
            count++;
            System.out.println(count+" count ");
        }
        System.out.println("final number of loops "+ count);
        */


     // for loop using array
       Human[] humans = new Human[10];

       for (int i= 0; i<humans.length;i++ ){ // will loop around the object and will update each value;


           humans[i] = new Human();
           humans[i].update("human "+ count ,18 +count );
           System.out.println( humans[i].toString());
           count ++;

       }
       count = 0;


       //enchanced for loop
        for (Human human_object : humans){ // Human is the object , human_object is name object being search at the time, humans is the array your searching each value for
            System.out.println( human_object.toString());

        }
        // nested for loop used for multidimensional array to loop through all object in each array
        int[][] footballscore = new int[3][4]; // creating a multidimensional array has three array each with 4 values

        for (int [] row : footballscore ){
            for (int h: row){
                h = (int)(Math.random()*20)+1; // this math method will pick a score between 1-20 and store it

            }
        }



    }
}

