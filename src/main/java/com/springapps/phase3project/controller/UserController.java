package com.springapps.phase3project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapps.phase3project.entity.Admin;
import com.springapps.phase3project.entity.Product;
import com.springapps.phase3project.entity.User;
import com.springapps.phase3project.service.AdminService;
import com.springapps.phase3project.service.ProductService;
import com.springapps.phase3project.service.UserService;

@Controller
public class UserController {

	@Autowired
	ProductService productService;
	@Autowired
	UserService userService;
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/login")
	public  String showlogin()
	{
		return "login";
	}
	
	@RequestMapping(value="/loginadmin",method=RequestMethod.POST)
	public String purchase(@ModelAttribute("admin")Admin admins,ModelMap model,HttpServletRequest request)
	{
		if(admins !=null && admins.getUsername()!=null && admins.getPassword()!=null)
		{
			
			if(admins.getUsername().equals("admin")&& admins.getPassword().equals("password")) 
			{
				String message="Welcome Admin";
				model.addAttribute(message);
				return "adminpage";
			}
			else 
			{
				model.addAttribute("error", "invalid details");
				return "login";
			}	
		}
		
			
		else
		{
			model.addAttribute("error", "Enter the details");
			return "login";
		}
		
		
	}
	
	@RequestMapping(value="purchasereport",method=RequestMethod.GET)
	public  String admin(@ModelAttribute("sportyshoes")Admin admins,ModelMap model)
	{
		
				List<Product> products=productService.getProducts();
				model.addAttribute("products", products);
				return "purchasepage";
		
		
	}
	
	
	@RequestMapping(value="user",method=RequestMethod.GET)
	public String user(@ModelAttribute("users")User user,ModelMap model)
	{
		List<User> users=userService.getUsers();
		model.addAttribute("users", users);
		return "userpage";
	}
	
	
	@RequestMapping("addproduct")
	public String showadd()
	{
		return "addProduct";
	}
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(@ModelAttribute("sportyshoes")Product product,ModelMap model)
	{
		productService.save(product);
		String message="Product Added";
		model.addAttribute(message);
		return "addDisplay";
	}
	
	
	@RequestMapping("updateproduct")
	public String showpdate()
	{
		return "updateProduct";
	}
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String update(@ModelAttribute("sportyshoes")Product product,ModelMap model)
	{
		productService.update(product);
		String message="Product Updated";
		model.addAttribute(message);
		return "updateDisplay";
	}
	
	
	@RequestMapping("deleteproduct")
	public String showdelete()
	{
		return "deleteProduct";
	}
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public String delete(@ModelAttribute("sportyshoes")Product product,ModelMap model)
	{
		productService.delete(product);
		String message="Product Deleted";
		model.addAttribute(message);
		return "deleteDisplay";
	}
	
	@RequestMapping("findproduct")
	public String showfind()
	{
		return "find";
	}
	@RequestMapping(value="findpro",method=RequestMethod.POST)
	public String findproduct(@ModelAttribute("sportyshoes")Product product,ModelMap model)
	{
		String cat=product.getCategory();
		List<Product> products=(List<Product>) productService.get1(cat);
		model.addAttribute("product",products );
		return "findbycategory";
	}
	
	@RequestMapping("password")
	public String showadmin()
	{
		return "passwordchange";
	}
	@RequestMapping(value="updatepassword",method=RequestMethod.POST)
	public String admins(@ModelAttribute("admin")Admin admin,ModelMap model)
	{
		adminService.change(admin);
		String message="Password Updated";
		model.addAttribute(message);
		return "changeDisplay";
	}
	
	
}
