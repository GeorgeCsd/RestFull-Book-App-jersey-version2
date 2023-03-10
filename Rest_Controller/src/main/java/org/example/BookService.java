package org.example;

public interface BookService {
    public Response addBook(Book b);

    public Response deleteBook(String id);

    public Book getBook(String id);

    public Books getAllBooks();


}
