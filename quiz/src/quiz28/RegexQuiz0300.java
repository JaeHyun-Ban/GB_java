package quiz28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
import org.apache.poi.ss.formula.functions.Match;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.CreateCell;

public class RegexQuiz0300 {

	public static void main(String[] args) {

		/*
		 * 1. day, store, grade, detail, price을 멤버로 갖는 Product클래스를 생성 
		 * 2. Product클래스는 getter, setter를 생성한다
		 * 3. BufferedReader를 사용해서 건담.txt파일을 읽어들인다 
		 * 4. 패턴별로 Product에저장한 후에 리스트에 추가
		 * 
		 * 5. 외부 라이브러리를 사용해서 xlsx엑셀파일로 추출하기
		 */

		List<Product00> list = new ArrayList<>();
		BufferedReader bf = null;

		try {
			// 정규 표현 패턴
			String pattern1 = "\\d{8}\\-\\d{2}-\\d{12,13}";
			String pattern2 = "[가-힣]+ [가-힣]+";// 스토어 패턴
			String pattern3 = "\\[[가-힣A-Z]+\\]";// 등급패턴
//			String pattern4 = "\\d+ *\\d+원";// 가격 패턴
			String pattern4 = "[0-9]+,[0-9]+원|[0-9]+원";// price
			bf = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Win10\\Desktop\\Backup\\java자료\\자료\\건담.txt"), "utf-8"));

			String line;
			while ((line = bf.readLine()) != null) {
				
				Matcher m1 = Pattern.compile(pattern1).matcher(line);
				Matcher m2 = Pattern.compile(pattern2).matcher(line);
				Matcher m3 = Pattern.compile(pattern3).matcher(line);
				Matcher m4 = Pattern.compile(pattern4).matcher(line);

				if (m1.find() && m2.find() && m3.find() && m4.find()) {
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					String detail = line.substring(m3.end() + 1, m4.start() - 1);
					// >등급패턴의 끝지점 +1, 가격시작지점의 -1
					String price = m4.group();

					Product00 p = new Product00(day, store, grade, detail, price);
					System.out.println(p.toString());
					list.add(p);
				}

			}
			Stream<Product00> stream = list.stream();
			stream.forEach(t -> System.out.println(t.toString()));
			
			//엑셀 생성 호출
			excel(list);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	// 엑셀 생성하기
	public static void excel(List<Product00> list) {

		//워크북 생성
		XSSFWorkbook wb = new XSSFWorkbook();
		//워크 시트 생성
		XSSFSheet sheet = wb.createSheet("새로운 시트");
		//행 생성
		XSSFRow row = sheet.createRow(0);//제일 위의 줄 = 0번째
		//셀 생성
		XSSFCell cell;
		
		//헤더 정보 구성
		cell = row.createCell(0);
		cell.setCellValue("날짜");
		cell = row.createCell(1);
		cell.setCellValue("지점");
		cell = row.createCell(2);
		cell.setCellValue("등급");
		cell = row.createCell(3);
		cell.setCellValue("상세정보");
		cell = row.createCell(4);
		cell.setCellValue("가격");
		
		for(int i = 0; i < list.size(); i++) {
			
			Product00 p = list.get(i);
			row = sheet.createRow(i + 1); //1행부터 시작
			
			cell = row.createCell(0);
			cell.setCellValue(p.getDay());
			cell = row.createCell(1);
			cell.setCellValue(p.getStore());
			cell = row.createCell(2);
			cell.setCellValue(p.getGrade());
			cell = row.createCell(3);
			cell.setCellValue(p.getDetail());
			cell = row.createCell(4);
			cell.setCellValue(p.getPrice());
		}
		
		
		try {
			File file = new File("C:\\Users\\Win10\\Desktop\\Backup\\java자료\\자료\\건담Excel.xlsx");
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				wb.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
	}

}
















































