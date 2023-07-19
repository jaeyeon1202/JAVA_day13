package overriding;

class TestClass06{
	String name = "홍길동";
	int age= 28;

	public String toString() {
		return "TestClass06["+name+","+age+"]";
	}
	
}
public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		System.out.println(t);
		System.out.println(t.toString());
	}
}
