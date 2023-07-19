package abstract_;

class A지상군{
	public void 공격() {System.out.println("지상군 공격");}
	public void 방어() {System.out.println("지상군 방어");}
}

class B공군{
	public void attack() {System.out.println("비행기 공격");}
	public void defense() {System.out.println("비행기 방어");}
}
public class MainClass04 {
	public static void main(String[] args) {
		A지상군 a = new A지상군();
		B공군 b = new B공군();
		a.공격(); b.defense();
	}
}
