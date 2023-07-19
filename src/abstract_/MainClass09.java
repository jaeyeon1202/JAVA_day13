package abstract_;

interface Test09{
	public void test();
}

class TestClass09 implements Test09{
	public void test() {
		System.out.println("test실행");
	}
}
public class MainClass09 {
	public static void main(String[] args) {
		Test09 t01 = new TestClass09();
		t01.test();
		
		System.out.println("++++++++++++++++++++++");
		
		Test09 t02 = new Test09() {
			public void test() {//인터페이스로 만ㄷ르면 실체화를 꼭 해줘야 한다.
				System.out.println("인터페이스");
			}
		};
		t02.test();
		
		System.out.println("=======================");
		
		Test09 t03 = () -> System.out.println("람다가 실행됩니다.");
		t03.test();
		
		Test09 t04 =() -> System.out.println("안녕?");
		t04.test();
		//람다를 실행하려면 인터페이스에 메소드는 하나만 있어야한다.
	}
}
