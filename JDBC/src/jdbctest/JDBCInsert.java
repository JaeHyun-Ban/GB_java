package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCInsert {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id> ");
		String id = sc.next();
		
		System.out.print("pw> ");
		String pw = sc.next();
		
		System.out.print("name> ");
		String name = sc.next();
		
		System.out.print("email> ");
		String email = sc.next();
		
		//1. 필요한 변수를 선언
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "user01";
		String upw = "user01";
		
		//1-1 i, u, d 는 받아올 결과가 없기 때문에 ResultSet이 필요가 없습니다.
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into member(id, pw, name, email) values(?, ?, ?, ?)"; //테이블 명은 작성하지 않는다
		
		
		
		try {
			//2. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//3. conn생성
			conn = DriverManager.getConnection(url, uid, upw);
			//4. pstmt생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);//`?`개수에 맞게 set생성
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			//5. sql문 실행 - i, u, d는 executeUpdate
			//업테이트 성공 = 1, 실패 = 0 을 리턴
			int result = pstmt.executeUpdate(); 
			
			if(result == 1) {
				System.out.println("DB입력 성공");
			}else {
				System.out.println("DB입력 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
	}
}


















































