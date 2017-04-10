import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest{
  Library library;
  Book book;

  @Before
  public void before() {
    library = new Library("The Jungle Book");
    book = new Book();
  }

  @Test
  public void hasName(){
    assertEquals("The Jungle Book", library.getName());
  }

  @Test
  public void shelfStartsEmpty(){
    assertEquals(0,library.booksCount());
  }

  @Test
  public void canStockBook(){
    library.stock(book);
    assertEquals(1,library.booksCount());
  }

  @Test
  public void cannotStockBookIfFull(){
    for(int i = 0; i < 25; i++){
      library.stock(book);
    }
    assertEquals(20,library.booksCount());
  }

  @Test
  public void shelfIsFull(){
    for (int i = 0; i < 20; i++){
      library.stock(book);
    }
    assertEquals(true, library.isShelfFull());
  }
}
