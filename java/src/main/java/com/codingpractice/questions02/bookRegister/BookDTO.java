package main.java.com.codingpractice.questions02.bookRegister;

public class BookDTO {

    private String title;
    private String author;
    private String isbn;
    private Genre genre;
    private boolean isBorrowed;

    public BookDTO(String title, String author, String isbn, Genre genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook(){
        if(!isBorrowed){
            this.isBorrowed = true;
            System.out.println(title + "(대여가능)");

        }else {
            System.out.println(title+"(대여중)");
        }
    }

    public void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println(title + " 반납완료");
        } else {
            System.out.println("대여하지 않은 책 입니다");
        }
    }
}
