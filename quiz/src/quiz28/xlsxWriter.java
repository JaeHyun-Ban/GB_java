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
		XSSFRow row = null;
		// 셀 생성
		XSSFCell cell = null;

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

	}
}
