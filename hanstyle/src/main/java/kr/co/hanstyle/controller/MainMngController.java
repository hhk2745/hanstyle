package kr.co.hanstyle.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainMngController {
	Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="/main.do")
	public String main(){
		System.out.println("wtf");
		log.debug("log test in main.do");
		return "main";
	}
}
