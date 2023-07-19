package abstract_;
/*
 interface
 - 추상화 메소드만 포함할 수 있다.
 - 변수는 static final 형식으로만 만들어진다.
 - 다중 상속이 가능하다.
 */

interface A02{}
interface B02{
	public void test();
}

class C02{
	public void test001() {
		
	}
}
class test02 extends C02 implements A02, B02{
	public void test() {
		
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		
	}
}
