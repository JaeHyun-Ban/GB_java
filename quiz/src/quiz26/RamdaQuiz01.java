package quiz26;

import quiz26.Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class RamdaQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. BufferedReader클래스를 사용해서 파일을 읽어들이세요.
		 * 2. ','기준으로 잘라서 Data클래스에 값을 한줄 단위로 저장합니다.
		 * 결축치 -> 빠진값을 적절하게 처리해서 list<Data>에 저장
		 * 3. 람다식을 이용해서, 지역: 서울, 짝수 월, 분양가격은 4000이상의 객체만 뽑아서 
		 * 새로운 리스트에 저장
		 */
		
		BufferedReader bfr = null;
		
		List<Data> list = new ArrayList<>(); //한줄 저장
		
		try {
			//1.
			bfr = new BufferedReader(new FileReader("D:\\course\\eclipse-jee-2020-06-R-win32-x86_64\\study_java\\quiz\\src\\quiz26\\주택도시보증공사_전국 평균 분양가격(2020년 2월).txt"));

			String str = "";
			
			while((str = bfr.readLine()) != null) {//읽은 줄이 null전 까지
				//한줄씩 읽기
				
				
				String[] arr = str.split(",", 5); //콤마로 나눠서 배열에 넣고
				
				//값을 문자열로 미리 지정
				String location = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				String price;
				
				//price는 애매한것들이 있다.
				//따라서 넣기전에 이상한 값들을 처리해준다
				arr[4] = arr[4].replace(" ", "").replace(",", "").replace("-", "");
				//>replace를 통해 여러가지 상황들을 모두 ""(없음) 처리해 준다.
				
				if(arr[4].equals("")) {//만약 없음이라면
					price = "0"; //모두 0으로 통일
				}else {//아니라면
					price = arr[4];//냅둠
				}
				
				Data data = new Data(location, size, year, month, price); //대입
				
				list.add(data);//list에 넣어주기
			}
			
			System.out.println("-----------------------------------------");
			//arr에 들어갓나 확인
//			for(int i = 0; i < arr.size(); i++) {
//				System.out.print(arr.get(i).getLocation() + " ");
//				System.out.print(arr.get(i).getSize() + " ");
//				System.out.print(arr.get(i).getYear() + " ");
//				System.out.print(arr.get(i).getMonth() + " ");
//				System.out.print(arr.get(i).getPrice() + " ");
//				System.out.println();
//			}
			
			//람다
			Stream<Data> stream = list.stream();
			stream.forEach((t) 
					-> System.out.println("Data [region=" + t.getLocation()
										+ ", size=" + t.getSize()
										+ ", year=" + t.getYear()
										+ ", month=" + t.getMonth()
										+ ", price=" + t.getPrice() + "]"));
			
			
			//람다식으로 조건을 뽑아 생성 =-> 안햇넹..
			
			
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}































