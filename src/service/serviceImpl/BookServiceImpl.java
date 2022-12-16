package service.serviceImpl;

import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookServiceImpl implements BookService {
    List<Book>books = new ArrayList<>();

    @Override
    public List<Book> createBooks(List<Book> books) {
        this.books.addAll(books);
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return this.books;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        List<Book>books1=new ArrayList<>();
        for (Book book:this.books){
            if (book.getGenre().equals(genre.toUpperCase())){
                books1.add(book);
                return books1;
            }
        }
        return null;
    }

    @Override
    public Book removeBookById(Long id) {
        for (Book books:this.books) {
            if (books.getId()==id){
                this.books.remove(books);
                return null;
            }

        }
        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        List<Book>books1 = this.books.stream().sorted(Comparator.comparing(Book::getPrice)).toList();
        return books1;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {

        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        List<Book>b;
        books.stream().filter(s->s.getName().substring(0,1).equalsIgnoreCase("A")).toList();
        return null;
    }

    @Override
    public Book maxPriceBook() {
        this.books.stream().max(Comparator.comparing(Book::getPrice));
        return maxPriceBook();
    }
}
