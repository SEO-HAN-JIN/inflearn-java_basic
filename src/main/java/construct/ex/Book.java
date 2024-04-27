package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, String author) {
        this(title, author, 0);
//        this.title = title;
//        this.author = author;
//        this.page = 0;
    }

    Book() {
        this("", "", 0);
//        this.title = "";
//        this.author = "";
    }

    void displayInfo() {
        System.out.println("제목: " + title+ ", 저자: " + author + ", 페이지: " + page);
    }
}
