package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServiceImpl implements MemberService{
	private static MemberServiceImpl instance = null;
	private MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {
		if (instance == null) instance = new MemberServiceImpl();
		return instance;
	}
	
	Scanner input = new Scanner(System.in);
	ArrayList<Object[]> member = new ArrayList<>();
	
	
	public void memberRegister() {//회원 정보 등록
		Object[] info = new Object[3];
		System.out.println("회원정보를 등록합니다.");
		System.out.print("이름 입력: ");
		info[0]=input.next();
		System.out.print("주소 입력: ");
		info[1]=input.next();
		System.out.print("나이 입력: ");
		info[2]=input.nextInt();
		member.add(info);
	}
	
	public void view() { //보기
		System.out.println("회원 정보 보기");
		for(int i=0; i<member.size();i++) {
			System.out.println("이름: "+member.get(i)[0]);
			System.out.println("이름: "+member.get(i)[1]);
			System.out.println("이름: "+member.get(i)[2]);
			
		}	
	}
	
	public void remove() {//삭제
		System.out.print("삭제할 회원정보의 이름 입력: ");
		String name = input.next();
		for(int i=0; i<member.size();i++) {
			if(name.equals(member.get(i)[0].toString())) {
				System.out.println("검색하신 회원정보를 삭제합니다.");
				member.remove(i);
				break;
			}
		}	
	}
	
	public void modify() {//수정
		System.out.print("수정할 회원정보의 이름 입력: ");
		String name = input.next();
		Object[] info = new Object[3];
		for(int i=0; i<member.size();i++) {
			if(name.equals(member.get(i)[0].toString())) {
				member.remove(i);
				System.out.println("수정할 정보 입력");
				System.out.print("이름>>");
				info[0]=input.next();
				System.out.print("주소>>");
				info[1]=input.next();
				System.out.print("나이>>");
				info[2]=input.next();
				member.add(info);
			}
		}
		System.out.println("정보가 수정되었습니다.");
	}
}
