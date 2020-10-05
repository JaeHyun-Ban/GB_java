package quiz26;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class RamdaQuiz02 {

	public static void main(String[] args) {

		/*
		 * # 숙 ㅡ 제(재밌겟당) 
		 * 1. BufferedReader로 파일을 읽습니다. 
		 * 2. 수출입 구분 "수출" 항목의 "오징어"가 포함되어 있는
		 * 데이터만 구분해서 해당 데이터의 총 합계를 구하세요.
		 */

		BufferedReader bfr = null; // 파일 읽기

		List<Data02> list = new ArrayList<>();// 구분지어 저장용

		try {
			// UTF-8로 읽을시 글자 깨짐이 발생해 EUC-KR로 변경해 읽어주기
			bfr = new BufferedReader(new InputStreamReader(
					new FileInputStream("D:\\course\\java\\해양수산부_수산물 품목별 수출입 현황 - 2020년 02월(월간).csv"),"euc-kr"));

			// 수출 항목에 오징어가 포함되어 있는 데이터만 구분
			
			//합계 저장용
			int mSum = 0;//월간 누적금액
			int ySum = 0;//연간 누적금액
			String[] arr;
			String str = ""; // 한줄씩 읽은 것 저장용
			while ((str = bfr.readLine()) != null) {
				
				arr = str.split(",", 10); //,로 구분해서 저장
				
				//모두 ','와 "'"를 제거해서 넣기
				String name = arr[3].replace(",", "").replace("'", "");//수입품 이름
				String ie = arr[4].replace(",", "").replace("'", "");//수입,수출
				String mUSD = arr[6].replace(",", "").replace("'", "");//월간 미화금액
				String yUSD = arr[8].replace(",", "").replace("'", "");//연간 미화 금액
				
//				System.out.println(name);
//				System.out.println(Arrays.toString(arr));
				
				
				if(name.contains("오징어") && ie.contains("수출")) {
					Data02 data = new Data02(ie, name, mUSD, yUSD);
					list.add(data);
					System.out.println(str);
					mSum += Integer.parseInt(mUSD);
					ySum += Integer.parseInt(yUSD);
					
				}
	
			}
			System.out.println("월간 총금액: " + mSum + " USD");
			System.out.println("연간 총금액: " + ySum + " USD");
			System.out.println("리스트에 저장 완료");
			System.out.println("------------------------------------");
			System.out.println("-----------람다-------------");
			Stream<Data02> stream = list.stream();
			stream.forEach((t) -> System.out.println(t.getIe()  + " | "+ t.getName()));
			System.out.println("월간 총금액: " + mSum + " USD");
			System.out.println("연간 총금액: " + ySum + " USD");
			

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bfr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
