package abstract_;

class A06 {
	public void a() {}
}
class B06 extends A06{
	public void b() {}
}
class C06 extends B06{
	public void c() {}
}

public class MainClass06 {
	public static void main(String[] args) {
		B06 b = new B06();
		C06 c = new C06();
		
	}
}
