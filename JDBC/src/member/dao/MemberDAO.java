package member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO implements InterMember{
	
	//DAO - Data Access Object
	
	//인터페이스를 통해 만드는 이 형태를 잘 기억해 두자
	
	//각각의 실행 로직을 이곳에서 메서드의 형태로 넣고 사용하도록 생성
	
	//final로 생성
	private final String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private final String uid = "user01";
	private final String upw = "user01";
	
	//생성자
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 로더 에러 발생");
			e.printStackTrace();
		}
	}
	
	
	@Override
	public int insertMember(MemberVO vo) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int result = 0; //결과 반환 변수
		
		//insert메서드
		String sql = "insert into member values(?, ?, ?, ?)";
		
		try {
			//커넥션 연결
			conn = DriverManager.getConnection(url, uid, upw);
			//sql문 전달
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			//sql문 실행시키기
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return result;
		//>dao.insertMember에서 result의 결과값이 반환된다
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
