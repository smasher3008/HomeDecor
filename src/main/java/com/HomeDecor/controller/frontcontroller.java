package com.HomeDecor.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.hibernate.service.internal.ProvidedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.HomeDecor.UserModel.User;
import com.HomeDecor.UserModel.UserService;
import com.HomeDecor.model.Product;
import com.HomeDecor.model.ProductService;


@Controller
public class frontcontroller 
{
	@Autowired
	ProductService ps;
	
	@Autowired
	UserService us;
	
	@RequestMapping("/")
	public String index()
	{
		System.out.println("In Index");
		
		return "index";
	}
	
	@RequestMapping("/index")
	public String index1()
	{
		System.out.println("In Index");
		
		return "index";
	}
	
	@RequestMapping(value = "/SignUp", method = RequestMethod.GET)
	   	public ModelAndView SignUpform(ModelMap model)
		{
			ModelAndView mav = new ModelAndView("SignUp");
			
			mav.addObject("User", new User());
			
	    	return mav;
		}
	
	@RequestMapping(value = "/SignUp", method = RequestMethod.POST)
	public ModelAndView SignUpSubmit()
	{
		ModelAndView mav = new ModelAndView("SignUp");
		
		mav.addObject("User", new User());
		
	    return mav;
	   }
	
	@RequestMapping(value = "/InsertUser", method = RequestMethod.POST)
	public ModelAndView InsertUser(@Valid@ModelAttribute("User")User u,BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println("Errors");
			
			ModelAndView mav = new ModelAndView("SignUp");
			
			mav.addObject("User",u);
			
			return mav;
		}
		
		else
			
		us.insert(u);
		
		ModelAndView mav = new ModelAndView("Success");
		
		mav.addObject("User", new User());
		
	    return mav;
	   }
	
	@RequestMapping(value = "/NewProduct", method = RequestMethod.GET)
   	public ModelAndView ProductSubmit()
	{
		ModelAndView mav = new ModelAndView("NewProduct");
		
		mav.addObject("Product", new Product());
		
    	return mav;
	}
	
	
	
	@RequestMapping(value = "/InsertProduct", method = RequestMethod.POST)
	public ModelAndView InsertProduct(@ModelAttribute("Product")Product p,Product pd,HttpServletRequest request, BindingResult result)
	{
		String filename=null;

		
		ServletContext context= request.getServletContext();

		String path = context.getRealPath("/");

		System.out.println("Path = "+path);

		p.setImage("resources/Image/" + p.getFile().getOriginalFilename());
		
		System.out.println("File name = "+p.getFile().getOriginalFilename());

		File f=new File(path + "resources/Image");
	    
		
		
		if(!p.getFile().isEmpty())

		{

		try

		{
			f =new File(f.getAbsoluteFile()+System.getProperty("file.separator")+ p.getFile().getOriginalFilename());

		byte[] bytes=p.getFile().getBytes();

		BufferedOutputStream bs=new BufferedOutputStream (new FileOutputStream(f));

		bs.write(bytes);

		bs.close();
		
		/*p.setFile("/resources/Image/");*/

		System.out.println("Image uploaded");
		}
		catch(Exception ex)

		{
			System.out.println(ex.getMessage());
		}
		
		}
		
		
		
		ps.insert(p);
		ps.delete(pd);
		ModelAndView mav = new ModelAndView("NewProduct");
		
		mav.addObject("Product", new Product());
		
	    return mav;
	   }

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String loginurl() {

	   return "signin";

	}
	
	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public ModelAndView logininfo(@RequestParam(value = "error",required = false) String error) {

		
		ModelAndView mav = new ModelAndView();
		if (error != null) {
			
			mav.addObject("error","Invalid Username and Password");
			
		}
		
		mav.setViewName("signin");

		return mav;

	}
	
	@RequestMapping(value = "/logincheck", method = RequestMethod.GET)
	public String logincheck() {

	   return "signin";

	}
	
	

	

	@RequestMapping("/AllProducts")
	public ModelAndView AllProducts()
	{
		
		
		List<Product> list = ps.list();
		
		String temp = "[";
		
		for( Product p:list )
		{
			temp += p.toString().replaceAll("\\\\","/") + ",";
		}
		
		if( temp.length() >1)
				temp = temp.substring(0, temp.length()-1);
		
			temp +="]" ;
		
			System.out.println(temp);
		
		ModelAndView mav = new ModelAndView();
		
		
		
		mav.addObject("JSONData",temp);
		
		return mav;
	}
}
