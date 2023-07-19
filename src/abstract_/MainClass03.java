package abstract_;

interface A03{
	public void test();
	public int test2();
}
class Test03 implements A03{
	public void test() {
		System.out.println("test실행");
	}
	public int test2() {
		System.out.println("test2 실행");
		return 0;
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		t.test();
		t.test2();
	}
}
