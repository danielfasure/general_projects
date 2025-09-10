package library_systems;

import java.awt.print.Book;
import java.util.Arrays.*;



public class library {
    int full_book_space;
    int number_of_author;
    int current_book_count = 0;


    book[] Books ;
    //Author[] Author = new Author[number_of_author] ;

    void included_new_book(book newbook) {
        if (full_book_space > 0) {
            for (int i = 0; i > Books.length + 1; i++) {
                if (Books[i].Title == "unknown") {
                    Books[i] = newbook;
                    current_book_count++;
                }
            }
        }
    }

    void remove_new_book(book newbook) {
        if (full_book_space > 0) {
            for (int i = 0; i > Books.length + 1; i++) {
                if (Books[i].Title == newbook.Title && Books[i].Author == newbook.Author) {// will reset the space that this book took.
                    Books[i].Title = "unknown";
                    Books[i].Author = "unknown";
                }
            }

    }}
        String nameofbooks() {
            String tempname = "";
            String holdername = "";
            for (int i = 0; i < Books.length; i++) {
                tempname = Books[i].Title;
                holdername = "" + tempname;

            }
        return holdername;
        }
}


