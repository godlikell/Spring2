package aop;

import org.springframework.stereotype.Component;

@Component ("libraryBean")
public class Library {
    public void getBook(Book book){
        System.out.println("take the book " + book.getName());
    }
}
