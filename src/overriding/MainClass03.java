package overriding;

final class Test03{//클래스 이름에 파이널이 붙으면 "이 클래스는 상속하지 마세요~" "new연산을 통해 객체생성해서 쓰세요~" 라는 뜻
	public void test() {
		System.out.println("부모의 기능");
	}//변경하지 말고 있는 그대로 쓰시오
}

class TestClass03 {
	public void test() {
		Test03 t = new Test03();
		System.out.println("좌식의 기능");
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test();
	}
}
