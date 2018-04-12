package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;

@Controller
public class ProductController {
	@RequestMapping("/addProduct")
	public ModelAndView add(Product product) throws Exception{
		ModelAndView mav = new ModelAndView("showProduct");
//		mav.setViewName("showProduct1");
		return mav;
	}
}
