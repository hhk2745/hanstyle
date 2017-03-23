package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.MemberDAO;
import spring.MemberInfoPrinter;
import spring.MemberPrinter;
import spring.MemberRegisterService;

@Configuration
public class JavaConfig2 {

	@Bean
	public MemberDAO memberDAO() {
		return new MemberDAO();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		MemberRegisterService service = new MemberRegisterService();
		service.setMemberDAO(memberDAO());
		return service;
	}

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		// infoPrinter.setMemberDAO(memberDAO());
		// infoPrinter.setMemberPrinter(memberPrinter());
		return infoPrinter;

	}
}
