package default_project;

public class JDBC요구사항 {
	
	public static void main(String[] args) {
		
		/*
		 * 도서관리, 재고관리, 물품관리 등등 간단한 주제로 선택해서 JDBC프로그램을 연습합니다.
		 * 
		 * 단, 테이블은 3개 이상
		 * 인터페이스를 반드시 사용합니다.
		 * ArrayList를 반드시 사용해서
		 * 사용메서드는 6개 이상,
		 * 
		 * 테이블 설계부터 > DB구축 -> 코드 작성
		 * 
		 * 조별로 협업
		 */
		
		//주제 : 도서관리(도서관)
		//책(도서관이 소장하는 책), 대여목록, 회원정보
		
		//책 - 번호(pk), 책이름, 책저자, 등록일
		//대여목록 - 회원id(fk), 책번호(fk), 대여날짜, 반납일(반납시 찍힘)
		//회원정보 - 회원id(pk), 이름, 전화번호
		
		
		//메서드로 관리할 것
		//1. 사용자 등록 - id, name, phone
		//2. 회원확인 - 
		//3. 도서 등록 - bno, name, writer, regdate
		//   도서 검색(제목, 저자, 대여 여부 확인)
		//4. 도서 대여
		//5. 도서 반납
		//6. 사용자 정보 수정
		
		
		/*
		 RentalDao, RentalDaoImpl
		 BookDao, BookDaoImpl
		  UserDao, UserDaoImpl
		
		
		//메서드로 관리할 것
		//1. 사용자 등록 - id, name, phone
		//2. 회원확인 - 
		//3. 도서 등록 - bno, name, writer, regdate
		//   도서 검색(제목, 저자, 대여 여부 확인)
		//4. 도서 대여
		//5. 도서 반납
		//6. 사용자 정보 수정

		 */
		
		
		
		
		
		
		
	}
}









