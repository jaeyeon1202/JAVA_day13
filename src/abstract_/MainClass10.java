package abstract_;

interface Test10{
	public void test(int num, String msg);
}


public class MainClass10 {
	public static void main(String[] args) {
		Test10 t01 = new Test10() {
			public void test(int num, String msg) {
				
			}
		};
		Test10 t02 = (n,s) -> {
			System.out.println("num: "+n);
			System.out.println("str: "+s);
		};
		t02.test(100, "test");
		
	}
}
