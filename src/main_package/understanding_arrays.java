package main_package;

class student{
    String name;
    int roll;

}


public class understanding_arrays {
    public static void main(String [] args){
        int nums[] = {3,4,5,6,7};
        int nums2[] = new int [4]; // this an array with 4 values

        nums[0] = 4; // this assigning a value on location i want
        nums[1] = 5;
        nums[2] = 6;
        nums[3] = 7;

       /* for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);

        }
         // multi demisonal array
       int  num_mult_array [][] = new int[3][4]; //3 is rows and 4 is columns
*/
        /*
        int  num_mult_array [][] = new int[3][4]; //3 is rows and 4 is columns
        for(int i=0; i<num_mult_array.length; i++){  // returing all the values of the array
            for(int j=0; j<num_mult_array[i].length; j++){ //nested loop will retrive all the value in row
              num_mult_array[i][j] = (int)(Math.random()*100);
            }
            System.out.println();// after the row is returned a line for the next set of values
        }
        */


/*
        //calling a value in the array
        for(int i=0; i<3; i++){  // returing all the values of the array
            for(int j=0; j<4; j++){ //nested loop will retrive all the value in row
                System.out.print(num_mult_array[i][j]+ "");
            }
            System.out.println();// after the row is returned a line for the next set of values
        }
  */



        /// //////////////jaggered
       /*

        int num_jagered_array [][] =new int[3][]; //create a box then create 3 rows
        num_jagered_array[0] = new  int[3];   // in row 1 there are 3 values
        num_jagered_array[1] = new  int[4];
        num_jagered_array[2] = new  int[5];

        */


        /// ///////////////////3d arrrays
int three_d_array [][][]= new int[3][4][5]  ;

///  object array /////#
        student s1 = new student();
        s1.name = "daniel";
        s1.roll = 18;

        student s2 = new student();
        s2.name = "sarah";
        s2.roll = 19;

        student s3 = new student();
        s3.name = "sam";
        s3.roll = 20;


        student student[] = new student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

     /*   for (int i = 0; i < main_package.student.length; i++) {
            System.out.println("Name: " + main_package.student[i].name + " Roll: " + main_package.student[i].roll+ " welcome to the school");

        }*/
        for (student studentinfo : student) {
            System.out.println(studentinfo.name);
        }
    }

}