package final_exam;

/**
 *
 * @author Ben Michalowicz
 */

import java.util.Arrays;
public class Book  implements Comparable {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
    
    
    private int id;
    private String title;
    private String[] authors;
    
    public Book(int id, String title, String authors){
        
        this.id = id;
        this.title = title;
        this.authors = authors.split(" ");
        
    }
    
    
    @Override
    public int compareTo(Object o){
        
        Book b = (Book) o;
        
      return this.id-b.id;
        
    }
    
}


class shelf{
    private Book[] books;
    
    void sort(){
        Arrays.sort(getBooks());
    }

    /**
     * @return the books
     */
    public Book[] getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(Book[] books) {
        this.books = books;
    }
}
