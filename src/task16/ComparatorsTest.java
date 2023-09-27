package task16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import task12_14_15.Book;

import java.util.ArrayList;
import java.util.List;

public class ComparatorsTest {
    public static List<Book> books = new ArrayList<>();

    @BeforeAll
    public static void init() {
        books.clear();
        books.add(new Book("title3", "author3", 30, 3, "33"));
        books.add(new Book("title1", "author2", 10, 1, "11"));
        books.add(new Book("title2", "author1", 20, 2, "22"));
        books.add(new Book("title4", "author2", 20, 1, "44"));
    }

    @Test
    public void title_author_compare_test() {
        books.sort(new TitleAuthorComparator());

        Assertions.assertEquals("title1", books.get(0).getTitle());
        Assertions.assertEquals("title2", books.get(1).getTitle());
        Assertions.assertEquals("title3", books.get(2).getTitle());
        Assertions.assertEquals("title4", books.get(3).getTitle());
    }

    @Test
    public void author_title_compare_test() {
        books.sort(new AuthorTitleComparator());

        Assertions.assertEquals("title2", books.get(0).getTitle());
        Assertions.assertEquals("title1", books.get(1).getTitle());
        Assertions.assertEquals("title4", books.get(2).getTitle());
        Assertions.assertEquals("title3", books.get(3).getTitle());
    }

    @Test
    public void author_title_price_compare_test() {
        books.sort(new AuthorTitlePriceComparator());

        Assertions.assertEquals("title2", books.get(0).getTitle());
        Assertions.assertEquals("title1", books.get(1).getTitle());
        Assertions.assertEquals("title4", books.get(2).getTitle());
        Assertions.assertEquals("title3", books.get(3).getTitle());
    }
}
