package com.shopping.main.Controller;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.shopping.main.Model.Product;
import com.shopping.main.Service.ProductService;
@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("/")
	public String Showportal() {
		return "WEB-INF/jsps/ShoppingPortal.jsp";
	}
	@RequestMapping("/Categories")
	public String ShowCategories() {		
		String array[]=new String [] {"Household","REady to eat","Beverages"};
		return "WEB-INF/jsps/Categories.jsp";
	}
	@RequestMapping("/Products")
	public String Showproduct(Model model,ProductService productService) {
//		model.addAttribute("pname", "Maggi");
//		model.addAttribute("price", 10);
//		Integer[] i = new Integer[] { 1223342, 453, 2, 232112332, 12321125, 4878 };
//		model.addAttribute("iarray", i);		
		List<Product> list=productService.getList();
		model.addAttribute("list",list);
		return "WEB-INF/jsps/Products.jsp";
	}
	@RequestMapping("/Contact")
	public String ShowContact(HttpServletRequest request) {
		request.setAttribute("ContactPerson", 45254424);
		return "WEB-INF/jsps/Contact.jsp";
	}
	@RequestMapping("/Cart")
	public ModelAndView ShowCart(ModelAndView mav) {
		mav.addObject("cartDetails", "Cart is empty");
		mav.setViewName("WEB-INF/jsps/Cart.jsp");
		return mav;
	}
	@RequestMapping("/Add-Product")
	public String readProductDetails(@RequestParam("pId")Integer Id
			,@RequestParam("pTitle")String Title,@RequestParam("pPrice")Integer Price,
			@RequestParam("pRating")Integer Rating,HttpServletRequest request)
	{
		Product p=new Product();
		p.setId(Id);
		p.setTitle(Title);
		p.setPrice(Price);
		p.setRating(Rating);
		System.out.println(p);
		String cpath=request.getContextPath();
		return "redirect" + cpath + "/Product";
	}								
}