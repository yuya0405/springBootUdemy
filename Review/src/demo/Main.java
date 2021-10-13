package demo;

import java.util.ArrayList;

import entity.Member;
import service.MemberService;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {
//		MemberServiceImpl service = new MemberServiceImpl();
//		MemberServiceImpl service = MemberServiceImpl.getInstance();
		
//		インターフェース名で呼び出す場合（Implが未だ作られていない時にやりやすい）
		MemberService service = MemberServiceImpl.getInstance();
		
		System.out.println(service.greet(2));
		System.out.println(service.getAll());
		ArrayList<Member> list = service.getAll();
		for(Member mem: list) {
			System.out.println(mem.getId() + " " + mem.getName() + " " + mem.getEmail());
			
		}
	}

}
