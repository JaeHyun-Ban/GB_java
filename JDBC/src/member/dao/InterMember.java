package member.dao;

public interface InterMember {
	
	//인터페이스란 프로그램과 프로그램 중간에 위치해 연결을 시켜주는 `접점`이라고 생각하자
	
	//추상메서드로 선언
//	public int insertMember(String id, String pw, String name, String email);
	//>1. VO를 받아서 사용할 수 있도록 매개변수를 수정해준다
	public int insertMember(MemberVO vo);
	
}
