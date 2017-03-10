package kr.co.hanstyle.product.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.hanstyle.product.service.ProductService;

@Controller
@RequestMapping("/product/*")
public class ProductController {

	@Resource
	private ProductService service;
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	public String list(ModelMap model){
		
		List prdList = (List)service.prdList();
		model.addAttribute("prdList", prdList);
		return "product/list";
	}
}
