package library_systems;

public class book extends library {
    String Title;
    String Author;
    book(){
        Title = "unkown";
        Author = "unkown";
    }
    book(String Title, String Author){
        this.Title = Title;
        this.Author = Author;
         }

    void add_to_library(book newbook){
        newbook.included_new_book(newbook); // using inheritance the book can use the library class
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
