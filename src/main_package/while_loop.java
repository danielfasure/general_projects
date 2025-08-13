package main_package;

public class while_loop {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 5){
            System.out.println("your value is " + i);
            int  j = 0;
            while (j <= 5){  // nested while loop
                System.out.println("your value is " + j);
                j++;
            }
            i++;


    }
        int a = 3;

        int b = 6;

        int result = (~a & b) | (a & ~b);

        System.out.println(result);

}
}
