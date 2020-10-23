package Inter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.BookDAO;
import VO.BooK;

public class BookDaoImpl implements BookDAO {

	/*
	 * 신규도서 등록 도서 검색(제목, 저자, 대여여부 확인) 도서 대여 도서 반납
	 */
	private final String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private final String uid = "user01";
	private final String upw = "user01";

	Connection conn = null;
	PreparedStatement pstmt = null;

	public BookDaoImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("접속 클래스 에러 발생");
			e.printStackTrace();
		}
	}

	// 신규도서 등록
	@Override
	public void insertBook(BooK book) throws SQLException { // 신규도서 등록
		// sql예외를 날려주면 try~catch를 한번 줄일 수 있다.

		int result = 0; // 결과반환 성공 1, 실패 0

		// insert메서드
		String sql = "insert into book values(?, ?, ?, ?)";

		// 커넥션 연결
		conn = DriverManager.getConnection(url, uid, upw);
		// sql문 전달
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, book.getId());
		pstmt.setString(2, book.getName());
		pstmt.setString(3, book.getWriter());
		result = pstmt.executeUpdate();

		try {
			conn.close();
			pstmt.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

	// 도서 목록 검색 - 제목
	@Override
	public void bookListByTitle(String name, boolean rent) throws SQLException {
		String sql = "select * from book " + "where name = ?";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();

		if (rent) {

		} else {
			while (rs.next()) {

				String bname = rs.getString("name");
				String bwriter = rs.getString("writer");
				System.out.println("책이름: " + bname);
				System.out.println("저자: " + bwriter);
			}
		}
		try {
			pstmt.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 도서검색 - 저자
	@Override
	public void bookListByWriter(String writer, boolean rent) throws SQLException {
		String sql = "select * from book " + "where writer = ?";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, writer);
		ResultSet rs = pstmt.executeQuery();

		if (rent) {

		} else {
			while (rs.next()) {

				String bname = rs.getString("name");
				String bwriter = rs.getString("writer");
				System.out.println("책이름: " + bname);
				System.out.println("저자: " + bwriter);
			}
		}

		try {
			pstmt.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 책이 등록되어 있는지 확인 (있다면 = true)
	@Override
	public boolean isBookExists(String id) throws SQLException {

		String sql = "select count(*) from book where bno = ?";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet resultSet = pstmt.executeQuery();

		return resultSet.getInt(1) > 0;
	}

	// 책을 빌렸는지 여부 (책을 빌릴 수 있다면 = true)
	@Override
	public boolean bookAvaliablity(String id) throws SQLException {
		final String sql = "select count(*) from rental where rental_bno = ? and return_date is null";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet resultSet = pstmt.executeQuery();

		return resultSet.getInt(1) <= 0;
	}

	// true =
	// 책 대
	public int bookRent(String title, boolean bool) throws SQLException {

		// 책 이름을 받아서 책번호를 꺼냄
		String sql = "select bno from book where name = ?";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, title);
		// 대여할 책 번호
		int rent = pstmt.executeUpdate();

		return rent;
	}

}
