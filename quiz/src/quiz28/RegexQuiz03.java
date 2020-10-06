package quiz28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. day, store, grade, detail, price을 멤버로 갖는 Product클래스를 생성
		 * 2. Product클래스는 getter, setter를 생성한다
		 * 3. BufferedReader를 사용해서 건담.txt파일을 읽어들인다
		 * 4. 패턴별로 Product에 저장한 후에 리스트에 추가
		 * 
		 * 5. 외부 라이브러리를 사용해서 xlsx엑셀파일로 추출하기
		 */
		
		BufferedReader bfr = null;
		
		List<Product> list = new ArrayList<>();
		
		
		try {
			bfr = new BufferedReader(new FileReader("D:\\course\\java\\건담.txt"));
			
			//패턴생성 >> 작성가능한것만 
			String pattern1 = "\\d+-\\d{2}-\\d+";//day
			String pattern2 = "건담[가-힣]*\\s+[가-힣]+점";//store
			String pattern3 = "\\[([A-Z]*|[가-힣]*)\\]";//grade
//			String pattern4 = "([A-Za-z]+)?\\s([A-Za-z]+)?\\s(\\d{1}/\\d+)*";//detail
			String pattern5 = "[0-9]+,[0-9]+원|[0-9]+원";//price
			
//			String[] pArr = {pattern1, pattern2, pattern3, pattern4, pattern5};
			
			String str = "";//한줄씩 담을 용

			while((str = bfr.readLine()) != null) {
			
				String[] arr = new String[5];
//				String day;
//				String store;
//				String grade;
//				String detail;
//				String price;
				
				//패턴 매칭
				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
//				Matcher m4 = Pattern.compile(pattern4).matcher(str); // 필요없음
				Matcher m5 = Pattern.compile(pattern5).matcher(str);
				
				
				if(m1.find() && m2.find() && m3.find() && m5.find()) {
					String day = arr[0] = m1.group();
					String store = arr[1] = m2.group();
					String grade = arr[2] = m3.group();
					String price = arr[4] = m5.group();
					//작성하기 힘든 부분은 substring으로 잘라내서 넣어주자
					String detail = arr[3] = str.substring(m3.end()+1, m5.start()-1);
//					System.out.println(Arrays.toString(arr));
					Product pro = new Product(day, store, grade, detail, price);
					list.add(pro);
				}
			}
			//람다로 출력
			Stream<Product> stream = list.stream();
			stream.forEach(t -> System.out.println("날짜:" + t.getDay() 
												+ ", 점포이름:" + t.getStore()
												+ ", 등급:" + t.getGrade()
												+ ", 상세정보:" + t.getDetail()
												+ ", 가격:" + t.getPrice()));
			
			xlsxWriter writer = new xlsxWriter();
			writer.write(list);
			
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bfr.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	
	}
	
	
	
}


















































