package quiz28;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

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

public class xlsxWriter {

	public void write(List<Product> list) {

		// 워크북 생성
		XSSFWorkbook workbook = new XSSFWorkbook();
		// 워크시트 생성
		XSSFSheet sheet = workbook.createSheet("new sheet");
		// 행 생성
		XSSFRow row=null;
		// 셀 생성
		XSSFCell cell=null;

		// 헤더 정보 구성
		row = sheet.createRow(0); //1행
		
		cell = row.createCell(0);
		cell.setCellValue("날짜");
		cell = row.createCell(1);
		cell.setCellValue("이름");
		cell = row.createCell(2);
		cell.setCellValue("등급");
		cell = row.createCell(3);
		cell.setCellValue("상세정보");
		cell = row.createCell(4);
		cell.setCellValue("가격");

		// 리스트의 size만큼 row를 생성
		
		for (int rowIdx = 0; rowIdx < list.size(); rowIdx++) {
			Product pro = list.get(rowIdx);
			// 행 생성
			row = sheet.createRow(rowIdx+1);

			cell = row.createCell(0);
			cell.setCellValue(pro.getDay());

			cell = row.createCell(1);
			cell.setCellValue(pro.getStore());

			cell = row.createCell(2);
			cell.setCellValue(pro.getGrade());

			cell = row.createCell(3);
			cell.setCellValue(pro.getDetail());
			
			cell = row.createCell(4);
			cell.setCellValue(pro.getPrice());
		}

		// 입력된 내용 파일로 쓰기
//		String path = "D:\\course\\java\\ExcelExFile.xlsx";
		
		FileOutputStream fos = null;
		File file = null;
		try {
			file = new File("D:\\course\\java\\ExcelExFile.xlsx");
			fos = new FileOutputStream(file);
			workbook.write(fos);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(workbook != null) workbook.close();
				if(fos != null) fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

//		// # Title
//		// 폰트 스타일 생성
//		XSSFFont TitleFont = workbook.createFont();// 폰트객체 생성
//		TitleFont.setFontHeightInPoints((short) 14);// 글자 크기
//		TitleFont.setFontName("맑은 고딕");// 글꼴 지정
//		TitleFont.setBold(true);// 진하게
//
//		// 셀 스타일 설정
//		CellStyle TitleStyle = workbook.createCellStyle();// 셀 스타일 생성
//		TitleStyle.setAlignment(HorizontalAlignment.CENTER);// 가운데 정렬
//		TitleStyle.setFont(TitleFont);// 셀에 스타일 적용
//
//		// # Body
//		// 폰트 스타일 생성
//		XSSFFont BodyFont = workbook.createFont();// 바디 폰트 객체 생성
//		BodyFont.setFontHeightInPoints((short) 11);// 글자 크기
//		BodyFont.setFontName("맑은 고딕");// 글꼴 지정
//
//		CellStyle BodyStyle = workbook.createCellStyle();// 바디 스타일 생성
//		BodyStyle.setAlignment(HorizontalAlignment.CENTER);// 가운데 정렬
//		// 바디 스타일의 테두리 모양 설정
//		BodyStyle.setBorderTop(BorderStyle.THIN);// 위쪽테두리 가늘게
//		BodyStyle.setBorderBottom(BorderStyle.THIN);// 아래쪽 가늘게
//		BodyStyle.setBorderLeft(BorderStyle.THIN);// 왼쪽 가늘게
//		BodyStyle.setBorderRight(BorderStyle.THIN);// 오른쪽 가늘게
//		BodyStyle.setFont(BodyFont);// 바디폰트 적용
//
//		// #Point
//		// 셀 스타일 생성
//		CellStyle PointStyle = workbook.createCellStyle();// 셀 스타일 객체 생성
//		PointStyle.setFillForegroundColor(HSSFColorPredefined.YELLOW.getIndex());// 셀 배경색 지정
//		PointStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);// 배경 색 지정
//		// 테두리 설정
//		PointStyle.setBorderTop(BorderStyle.THIN);
//		PointStyle.setBorderBottom(BorderStyle.THIN);
//		PointStyle.setBorderLeft(BorderStyle.THIN);
//		PointStyle.setBorderRight(BorderStyle.THIN);
//
//		// # Header
//		XSSFFont HeadFont = workbook.createFont();// 헤더 폰트 생성
//		HeadFont.setBold(true);// 글씨 굵게
//		HeadFont.setFontHeightInPoints((short) 11);// 글자 크기
//		HeadFont.setFontName("맑은 고딕");// 글꼴 이름 설정
//		// 헤더 스타일
//		CellStyle HeadStyle = workbook.createCellStyle();
//		HeadStyle.setAlignment(HorizontalAlignment.CENTER);// 가운데 정렬
//		HeadStyle.setFillForegroundColor(HSSFColorPredefined.GREY_25_PERCENT.getIndex());
//		HeadStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);// 채움 패턴
//		HeadStyle.setBorderBottom(BorderStyle.THIN);
//		HeadStyle.setBorderTop(BorderStyle.THIN);
//		HeadStyle.setBorderLeft(BorderStyle.THIN);
//		HeadStyle.setBorderRight(BorderStyle.THIN);

	}
}
