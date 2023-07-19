package overriding;
/*
 오버라이딩
 - 상속받은 자식 메소드의 내용을 변경하는 것
 - 부모 메소드와 다르게 자신에게 맞게 변경하여 사용한다.
 오버라이딩 조건
 - 부모 메소드의 이름과 동일하게 만들어야 한다.
 - 자식의 제근제한자는 부모의 접근제한자보가 작으면 안된다.
 > private > package > protected > public
 */

class Ferrari{
	public int ye;
	public Ferrari(int ye) {this.ye=ye;}
	public int getYe() {return ye;}
	public void speed() {
		System.out.println(ye+"년식 페라리 속도: 300km");
	}
}

class NewFerrari extends Ferrari { 
	public NewFerrari(int ye) {
		super(ye);
	}
	
	public void autoSystem() {
		System.out.println("자동 운전모드");
	}
	public void speed() {
		System.out.println(getYe()+"년식 페라리 속도: 350km");
	}//부모가 가지고 있는 메소와 같은 이름으로 메소드를 만들면 
	//흘러내려서 내가 만든 새로운 메소드가 실행된ㄷ
}
public class MainClass01 {
	public static void main(String[] args) {
		//Ferrari fe = new Ferrari(2023);
		//fe.speed();
		NewFerrari nFe = new NewFerrari(2024);
		nFe.speed();
		nFe.autoSystem();
	}
}
