public class Library{
  private String name;
  private Book[] shelf;

  public Library(String name){
    this.name = name;
    this.shelf = new Book[20];
  }

  public String getName(){
    return this.name;
  }

  public int booksCount(){
    int count = 0;
    for(Book book : this.shelf){
      if(book != null){
        count++;
      }
    }
    return count;
  }

  public void stock(Book book){
    if(isShelfFull()){
      return;
    }
    int booksCount = booksCount();
    shelf[booksCount] = book;
  }

  public boolean isShelfFull(){
    return booksCount() == shelf.length;
  }
}
