package kr.co.hanstyle.product.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/product/*")
public class ProductController {

	Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="list.do", method=RequestMethod.GET)
	public String list(ModelMap model){
		log.debug("log test :::::: ");
		System.out.println("/product/list.do");
		return "product/list";
	}
}
