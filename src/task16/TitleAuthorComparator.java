package task16;

import task12_14_15.Book;

import java.util.Comparator;
public class TitleAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int titleCompare = book1.getTitle().compareTo(book2.getTitle());
        if (titleCompare != 0) {
            return titleCompare;
        } else {
            return book1.getAuthor().compareTo(book2.getAuthor());
        }
    }
}
