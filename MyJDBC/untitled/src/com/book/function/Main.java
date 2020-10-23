package com.book.function;

import com.book.function.user.UserDaoImpl;
import com.book.function.book.BookDaoImpl;
import com.book.function.rental.RentalDaoImpl;
import com.book.pojo.Book;
import com.book.pojo.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
    public static final String uid = "user01";
    public static final String upw = "user01";

    private static Scanner scanner;
    private static RentalDaoImpl rentalDao;
    private static BookDaoImpl bookDao;
    private static UserDaoImpl userDao;

    private static ArrayList<Book> books;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        scanner = new Scanner(System.in);

        rentalDao = new RentalDaoImpl(url, uid, upw);
        bookDao = new BookDaoImpl(url, uid, upw);
        userDao = new UserDaoImpl(url, uid, upw);
        books = new ArrayList<>();

        while(true) {
            System.out.println("=========메뉴 선택=========");
            System.out.println("-----사용자-----");
            System.out.println("1. 사용자 등록");
            System.out.println("2. 사용자 수정");
            System.out.println("3. 사용자 확인");
            System.out.println("------검색------");
            System.out.println("4. 도서를 제목으로 검색");
            System.out.println("5. 도서를 저자로 검색");
            System.out.println("------도서------");
            System.out.println("6. 도서 대여");
            System.out.println("7. 도서 반납");
            System.out.println("8. 도서 등록 (다수)");
            System.out.println("=========================");
            System.out.print("\n> ");

            String result = scanner.next();

            System.out.println("");

            switch (result){
                case "1": userRegister(); break;
                case "2": userEdit(); break;
                case "3": getUserByID(); break;
                case "4": bookSearchByTitle(); break;
                case "5": bookSearchByAuthor(); break;
                case "6": bookRent(); break;
                case "7": bookReturn(); break;
                case "8": registerMultipleBook(); break;
                default: System.err.println("없는 메뉴");
            }

            System.out.println("\n");
        }
    }

    public static void userRegister() throws SQLException {
        System.out.print("아이디> ");
        String id = scanner.next();
        System.out.print("이름> ");
        String name = scanner.next();
        System.out.print("전화번호> ");
        String phone = scanner.next();

        userDao.insertUser(new User(id, name, phone));
    }

    public static void userEdit() throws SQLException {
        System.out.print("아이디> ");
        String id = scanner.next();
        userDao.userUpdate(id);
    }

    public static void getUserByID() {

    }

    public static void bookSearchByTitle() throws SQLException {
        System.out.print("도서 제목> ");
        String title = scanner.next();
        System.out.print("남은 도서만 확인(t/f)> ");
        String tf = scanner.next();

        bookDao.bookListByTitle(title, tf.equals("t"));
    }

    public static void bookSearchByAuthor() throws SQLException {
        System.out.print("저자 이름> ");
        String author = scanner.next();
        System.out.print("남은 도서만 확인(t/f)> ");
        String tf = scanner.next();

        bookDao.bookListByWriter(author, tf.equals("t"));
    }

    public static void bookRent() throws SQLException {
        System.out.print("사용자 아이디> ");
        String id = scanner.next();
        System.out.print("대여할 책 코드> ");
        String book = scanner.next();

        if(rentalDao.rentBook(id, book) == 1) System.out.println(" ==> 성공적으로 도서를 대여했습니다");
        else System.err.println("오류: 대여 할 수 없습니다");
    }

    public static void bookReturn() throws SQLException {
        System.out.print("반납할 책 코드> ");

        if(rentalDao.returnBook(scanner.next()) == 1) System.out.println(" ==> 반납하셨습니다");
        else System.err.println("오류: 반납 할 수 없습니다");
    }

    /*
        public interface BookDao {
            public int insertBook(Book book) throws SQLException;

        }

        private String id;
        private String name;
        private String phone;
    */

    public static void registerMultipleBook() throws SQLException {

    }


}
