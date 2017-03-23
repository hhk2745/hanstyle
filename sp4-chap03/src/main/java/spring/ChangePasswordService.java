package spring;

public class ChangePasswordService {
	
	private MemberDAO memberDAO;

	public ChangePasswordService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public void changePassword(String email, String oldPass, String newPass) {

		Member member = memberDAO.selectByEmail(email);
		
		if (member == null) {
			throw new MemberNotFoundException();
		}
		member.changePassword(oldPass, newPass);
		memberDAO.update(member);
	}
}
