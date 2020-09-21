package quiz17;

import java.util.ArrayList;


public interface Music {
	
	ArrayList<String> list = new ArrayList<String>();
	
	public String select(String n);
	//재생목록에 노래 추가
	public void add();
	
	//재생목록 확인
	public void playlist();	
	
	//노래를 재생
	public void play();
	
	//다음노래
	public void next();
	
	//이전노래
	public void prev();
	
	//노래 종료
	public void end();
	
	
}
