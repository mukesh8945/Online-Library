import java.util.*;

public class OnlineLibrary {
    class Library{
        String []books;
        int num_of_books;
        Library(){
            this.books = new String[100];
            this.num_of_books = 0;
        }
        void addBook(String book){
            books[num_of_books] = book;
            num_of_books++;
        }
        void issueBook(String book){
            for (int i = 0;i<books.length;i++){
                if(books[i].equals(book)){
                    books[i] = null;
                    System.out.println(book+" book has been issued");
                    return;
                }
            }
            System.out.println(book+" book doesn't exists");
        }
        void showAvailableBooks(){
            for (int i = 0;i<books.length;i++){
                if(books[i] == null){
                    continue;
                }
                System.out.println("* "+books[i]);
            }
        }
        void returnBook(String book){
            System.out.println(book+" book has been returned by the student");
            addBook(book);
        }
    }
    
    
        public static void main(String[] args) {
            OnlineLibrary l1 = new  OnlineLibrary();
            l1.addBook("C++");
            l1.addBook("Java");
            l1.addBook("Python");
            l1.addBook("WebDev");
            l1.showAvailableBooks();
            l1.issueBook("C++");
            l1.showAvailableBooks();
            l1.returnBook("C++");
            l1.showAvailableBooks();
    
        }
    
}
