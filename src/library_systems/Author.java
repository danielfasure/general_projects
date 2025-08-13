package library_systems;

public class Author extends Book_creator {
    String name;
    int size = 10;

Book_creator [] author_book = new Book_creator[size];
    Book_creator [] temp_book = new Book_creator[size] ;// choosing 10 for now will update value if author has reach 10

    void AddBookToList(Book_creator book){// this method will add a book object to author array of book objects
      int   count = 0;
        if (author_book.length>=10){
            size += 10 ;
            temp_book = new Book_creator[size];
            for (int i =0;i <size+1;i++){ // will store all the author book into a temporary array
         temp_book[i] = author_book[i];

            }
            for (int i = 0; i<size+1;i++){ // this loop will get to the newest space in the array and add the object

                if (temp_book[i].Author =="unknown"){
                    temp_book[i]=book;
                    break;
                }count++ ;
            }
            author_book = new Book_creator[size]; //  creating duplicate array
            author_book[count] = temp_book [count]; // the book place will be store in the author books


        }
        for (int i = 0 ; i<author_book.length+1; i++){// loop will add the book to author next avaibale space.
             if (author_book[i]==null){
                 author_book[i]= book;
                 break;
             }
        }

    }

}

