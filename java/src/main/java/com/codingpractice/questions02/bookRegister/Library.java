package main.java.com.codingpractice.questions02.bookRegister;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private HashMap<Genre, ArrayList<BookDTO>> bookMap;

    // 생성자
    public Library() {
        this.bookMap = new HashMap<>();
        for (Genre genre : Genre.values()) {
            bookMap.put(genre, new ArrayList<>());
        }
    }

    // 도서 추가 메소드
    public boolean addBook(BookDTO book) {
        for (ArrayList<BookDTO> books : bookMap.values()) {
            for (BookDTO existingBook : books) {
                if(existingBook.getTitle().equals(book.getTitle())){
                    System.out.println("이미 같은 제목의 도서가 존재합니다");
                    return false;
                }
                if(existingBook.getIsbn().equals(book.getIsbn())){
                    System.out.println("이미 같은 번호의 도서가 존재합니다");
                    return false;
                }
            }
        }

        bookMap.get(book.getGenre()).add(book);
        return true;
    }

    // 특정 장르 도서 목록 출력 메소드
    public void printBookGenre(Genre genre) {
        ArrayList<BookDTO> books = bookMap.get(genre);
        System.out.println(genre + " 장르 도서 목록");
        for (BookDTO book : books) {
            System.out.println("["+book.getTitle()+"]" + " " + book.getAuthor() + " " + book.getIsbn() + " " + book.getGenre() + " "+ book.isBorrowed());
        }
    }

    // 도서 대여 메소드
    public void borrowBook(String num) {
        for (ArrayList<BookDTO> books : bookMap.values()) {
            for (BookDTO book : books) {
                if(book.getIsbn().equals(num)){
                    book.borrowBook();
                    return;
                }
            }
        }

        System.out.println("해당 " + num + " 번의 도서를 찾을 수 없습니다");
    }

    //  도서 반납 메소드

    public void returnBook(String num) {
        for (ArrayList<BookDTO> books : bookMap.values()) {
            for (BookDTO book : books) {
                if(book.getIsbn().equals(num)){
                    book.returnBook();
                    return;
                }
            }
        }
        System.out.println("해당 " +  num + " 번의 도서를 찾을 수 없습니다");
    }



}
