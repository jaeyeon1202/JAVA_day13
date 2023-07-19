package abstract_;

interface Test11{ //자바에서 제공해주는 기능
	public void test();
}

class TestClass11{ //자바에서 제공해주는 기능
	public void testClass(Test11 t)  {
		System.out.println("기능 실행 합니다");
		t.test();
	}
}

public class MainClass11 {
	public static void main(String[] args) {
		TestClass11 t = new TestClass11();
		
		t.testClass(null);
	}
}
