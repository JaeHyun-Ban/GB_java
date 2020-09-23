package api.lang.stringbuilder;

public class StringBuildEx {

	public static void main(String[] args) {

		// StringBuffer, StringBuilder

		String str = new String("java");
		StringBuffer sb = new StringBuffer("java");

		System.out.println(str);
		System.out.println(sb);

		str = str + "choco";
		sb.append("choco");

		System.out.println(str);
		System.out.println(sb);

		// 글에 문자열 추가 >> 뒤에 붙여짐
		sb.append("chip");
		System.out.println(sb);

		// 중간에 문자열 추가
		sb.insert(4, "  ");
		System.out.println(sb);

		// 문자열 변경 replace
		sb.replace(0, 4, "자바");
		System.out.println(sb);

		// 문자열 삭제 delete
		sb.delete(2, sb.length());
		System.out.println(sb);

		// 문자열 거꾸로 뒤집기 reverse()
		sb.reverse();
		System.out.println(sb);
		
//		toString() buffer 를 문자열(String)로 변경
		if(sb.toString().equals("자바")){
			System.out.println("문자열이 같음");
		}
		
		
		
		
		
		
	}

}


































