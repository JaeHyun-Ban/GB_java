package ramda.basic;

public class MainClass {

	public static void main(String[] args) {

		// 2. 익명 객체 방법
		// person타입 생성
		Person p = new Person();

		p.greeting(new Say01() {

			@Override
			public void talking() {
				System.out.println("한국말: 안녕!");

			}
		});

		// 3. 람다표현식(실행시켜야 할 문장이 한줄이라면 {}가 생략 가능
		p.greeting(() -> {
			System.out.println("미국말: HI!");
		});
		p.greeting(() -> System.out.println("미국말: HI!"));
//		p.greeting(() -> {});
		// () = Say01()
		// {} = {
//		@Override
//		public void talking() {
//			System.out.println("한국말: 안녕!");
//		}
//			
//		}

		System.out.println("--------------------------------------------");
		//매개변수가 있는 유형 - say02
		p.greeting(new Say02() {
			
			@Override
			public void talking(String word) {
				System.out.println(word);
				
			}
		});
		
		p.greeting((word) -> System.out.println(word));
		//(word) = talking(String word)
		
		System.out.println("---------------------------------");
		//say03
		p.greeting(new Say03() {
			
			@Override
			public String talking() {
				return "finish";
			}
		});
		//리턴이 있다면 중괄호를 열어야한다.
		p.greeting(() -> {
			System.out.println("return finish");
			return "finish";
		}).greeting(() -> {
			
			return "finish";
		});
		
		
		
		
		
		
		
		
		
		
	}

}





























