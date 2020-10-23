

import java.sql.SQLException;

import VO.BooK;

public interface BookDAO{

	//신규도서 등록
	public void insertBook(BooK book) throws SQLException;
	
	//도서 목록 검색
	public void bookList(String name, String writer, boolean rent);//제목,저자  대여여부(boolean)

}































