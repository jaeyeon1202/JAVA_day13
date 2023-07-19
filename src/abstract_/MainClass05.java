package abstract_;

class A지상군05 implements Army{
	public void attack() {
		System.out.println("지상군 공굑");
	}
	public void defense() {
		System.out.println("지상군 방어");
	}
}
public class MainClass05 {
	public static void main(String[] args) {
		Army a = new A지상군05();
		a.attack(); a.defense();
	}
}
