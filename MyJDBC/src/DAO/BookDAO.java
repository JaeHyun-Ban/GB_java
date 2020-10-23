package DAO;

import java.sql.SQLException;

import VO.BooK;

public interface BookDAO {

	// 신규도서 등록
	public void insertBook(BooK book) throws SQLException;

	// 도서 목록 검색 -- 제목
	public void bookListByTitle(String name, boolean rent) throws SQLException;

	// 도서 검색 -- 저자
	public void bookListByWriter(String writer, boolean rent) throws SQLException;
	// 제목,저자 대여여부(boolean)

	public boolean isBookExists(String id) throws SQLException ;
	
	public boolean bookAvaliablity(String id) throws SQLException;
	
	
	
}
