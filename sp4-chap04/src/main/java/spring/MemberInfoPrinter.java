package spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {

	@Resource(name="memberDAO")
	private MemberDAO memberDAO;
	
	@Resource(name="memberPrinter")
	private MemberPrinter pinter;
	//printer 참조변수의 이름

	public void printMemberInfo(String email) {
		Member member = memberDAO.selectByEmail(email);
		if(member==null){
			System.out.println("NO DATA\n");
			return;
		}
		pinter.print(member);
		System.out.println("a".hashCode());
	}
	
	

}
