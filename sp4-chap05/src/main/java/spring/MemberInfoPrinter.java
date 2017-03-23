package spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {

	private MemberDAO memberDAO;
	private MemberPrinter memberPrinter;
	// printer 참조변수의 이름

	public void printMemberInfo(String email) {
		Member member = memberDAO.selectByEmail(email);
		if (member == null) {
			System.out.println("NO DATA\n");
			return;
		}
		memberPrinter.print(member);
		System.out.println("a".hashCode());
	}

	@Autowired
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Autowired
	public void setMemberPrinter(MemberPrinter memberPrinter) {
		this.memberPrinter = memberPrinter;
	}

}
