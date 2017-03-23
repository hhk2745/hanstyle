package assembler;

import spring.ChangePasswordService;
import spring.MemberDAO;
import spring.MemberRegisterService;

public class Assembler {

	private MemberDAO memberDAO;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;

	public Assembler() {
		memberDAO = new MemberDAO();
		regSvc = new MemberRegisterService(memberDAO);
		pwdSvc = new ChangePasswordService(memberDAO);
	}

	public MemberDAO getMemberDAO() {
		return memberDAO;
	}

	public MemberRegisterService getRegSvc() {
		return regSvc;
	}

	public ChangePasswordService getPwdSvc() {
		return pwdSvc;
	}

}
