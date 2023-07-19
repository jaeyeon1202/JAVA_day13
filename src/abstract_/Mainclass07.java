package abstract_;

import java.util.Scanner;

class A지상군07 implements Army{
	public void attack() {
		System.out.println("지상군공격");
	}
	public void defense() {
		System.out.println("지상군 방어");
	}
}

class B공군07 implements Army{
	public void attack() {
		System.out.println("비행기 공격");
	}
	
	public void defense() {
		System.out.println("비행기 방어");
	}
}
public class Mainclass07 {
	public static void main(String[] args) {
		//A지상군07 a = new A지상군07();
		//B공군07 b = new B공군07();
		
		Army a = null;
		
		System.out.println("적이 쳐들어왔습니다.");
		System.out.println("1.지상군\n2.공군");
		System.out.println(">>>");
		Scanner sc = new Scanner(System.in);
		
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("지상군이 선택되었습니다.");
			a=new A지상군07();
		}else if(choice ==2) {
			System.out.println("공군이 선택되었습니다.");
			a= new B공군07();
		}
		
		System.out.println("1.공격\n2.방어");
		int num = sc.nextInt();
		if(num==1) {
			a.attack();
		}else
			a.defense();
		
		/*
		if(choice==1 && num==1) {
			a.attack();
		}else if(choice==1 && num==2) {
			a.defense();
		}
		*/
	}
}
