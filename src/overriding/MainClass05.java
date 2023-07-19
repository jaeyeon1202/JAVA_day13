package overriding;

class Teset{
	public void test111() {}
}
class TestClass05{
	
}

public class MainClass05 {
	public static void main(String[] args) {
		TestClass05 t = new TestClass05();
		System.out.println(t.getClass());
		System.out.println(t.toString()); //객체에 대한 정보
		System.out.println("aaa".getClass());
		System.out.println(t);//객체에 대한 정보
	}
}
