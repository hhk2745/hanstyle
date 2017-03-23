package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.MemberDAO;
import spring.MemberInfoPrinter;
import spring.MemberPrinter;

@Configuration
public class ConfigPart2 {

	@Autowired
	private MemberDAO memberDAO;
	
	@Bean
	public MemberPrinter memberPrinter(){
		return new MemberPrinter();
	}
	
	public MemberInfoPrinter memberInfoPrinter(){
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDAO(memberDAO);
		infoPrinter.setMemberPrinter(memberPrinter());
		return infoPrinter;
	}
}
