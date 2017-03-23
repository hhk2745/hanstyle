package spring;

import java.util.Date;

import javax.annotation.Resource;

public class MemberRegisterService {
	
	@Resource(name="memberDAO")
	private MemberDAO memberDAO;
	
	public MemberRegisterService() {
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
