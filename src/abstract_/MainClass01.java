package abstract_;

abstract class TestClass01{
	
	public abstract void function(); //추상화
	//실체화가 없기 때문에 추상화 메소드라고 함
	//상속받은 클래스가 존재한다면 그 클래스에서는 이 메소드를 무조건 실체화 시텨야 한다 -> 오버라이딩해라
	
	public void test() {System.out.println("test 기능");}
}

class Test01 extends TestClass01{
	public void test01() {System.out.println("새로운 기능");}
	public void function() {
		System.out.println("aaa");
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.function();
		t.test();
		t.test01();
	}
}
