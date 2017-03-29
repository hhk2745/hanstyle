package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.MemberDAO;
import spring.MemberRegisterService;

@Configuration
public class ConfigPart1 {

	@Bean
	public MemberDAO memberDAO(){
		return new MemberDAO();
	}
	@Bean
	public MemberRegisterService memberRegSvc(){
		MemberRegisterService service = new MemberRegisterService();
		
		service.setMemberDAO(memberDAO());
		return service;
	}
}
