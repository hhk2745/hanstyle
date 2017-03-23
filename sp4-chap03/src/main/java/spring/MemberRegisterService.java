package spring;

import java.util.Date;

public class MemberRegisterService {

	private MemberDAO memberDAO;
	
	
	public MemberRegisterService(MemberDAO memberDAO){
		this.memberDAO = memberDAO;
	}
	
	public void regist(RegisterRequest req){
		Member member = memberDAO.selectByEmail(req.getEmail());
		if(member!=null){
			throw new AlreadyExistingMemberException("dup email "+ req.getEmail());
		}
		
		Member newMember = 
				new Member(
						req.getEmail(), 
						req.getPassword(), 
						req.getName(), 
						new Date());
		
		memberDAO.insert(newMember);
		
	}
}
