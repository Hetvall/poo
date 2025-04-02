public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void readPage(){
        System.out.println("You are reading " + title + " from " + author + " and the total pages are " + pages);
    }
}
