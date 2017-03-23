package spring;

public class MemberInfoPrinter {

	private MemberDAO memberDAO;
	private MemberPrinter memberPrinter;

	public void printMemberInfo(String email) {
		Member member = memberDAO.selectByEmail(email);
		if(member==null){
			System.out.println("NO DATA\n");
			return;
		}
		memberPrinter.print(member);
		System.out.println("a".hashCode());
	}

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public void setMemberPrinter(MemberPrinter memberPrinter) {
		this.memberPrinter = memberPrinter;
	}
	

}
