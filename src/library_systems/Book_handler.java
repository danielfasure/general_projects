package library_systems;

public class Book_handler extends library {
    library lib ;

    void deleteBook(book book){

    }
    void add_book_to_collection(book book){
        lib.included_new_book(book);
    }
    void update_book_title(book updatebook,book currentbook){ // will take in the object that the user wants to change check the library class has at least one book to search through
        if (lib.current_book_count >=1){
            for (int i = 0; i<lib.current_book_count; i++){
                if (lib.Books[i].Title == currentbook.Title){
                    lib.Books[i].Title = updatebook.Title;
                    break;
                } else if (lib.Books[i].Title == currentbook.Title && lib.Books[i].Author == "unknown") {
                    lib.Books[i].Title = updatebook.Title;
                    break;
                }
            }
        }
        else {
            System.out.println("there are no books in this library");
        }
    }

}
