package com.example.WebApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.WebApplication.model.Blog;
import com.example.WebApplication.model.WriteBlog;
import com.example.WebApplication.repo.BlogRepository;
import com.example.WebApplication.repo.WriteBlogRepository;
@Controller 
public class webcontroller {
	
	@Autowired
	BlogRepository repo;
	
	@Autowired
	WriteBlogRepository writeBlog;
	
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/test")
	public String login(){
		return "test";
	}
	
	@RequestMapping("/readblog")
	public String readBlog(){
		return "readblog";
	}
	
	@RequestMapping("/userViewPage")
	public String addBlogs(String userName,String password) {
		boolean user1=repo.existsByuserName(userName);
		boolean pass=repo.existsBypassword(password);
		//System.out.println(userName+"  "+password);
		if((user1) && (pass)) {
			return "userView";
		}
		else {
			return "test";
		}
	}
	@RequestMapping("/displayCultureBlogList")
	public String displayCultureBlog() {
		
		List<WriteBlog> foodBlogList=writeBlog.findByTag("food");
		System.out.println("test"+foodBlogList);
		ModelAndView mv = new ModelAndView();

	     mv.addObject("foodBlogList",foodBlogList);
		 return "displayCultureBlog";
	}
	@RequestMapping("/displayCultureBlog")
	public String viewBlogs() {
		 return "displayCultureBlog";
	}
	@RequestMapping("/userView")
	public String userPage() {
		 return "userView";
	}
	
	@RequestMapping("/writeblog")
	public String writeBlogPage() {
		 return "writeblog";
	}
	
	@RequestMapping("/addUser")
	public ModelAndView addUser(Blog blog) {
	     ModelAndView mv = new ModelAndView();

	     mv.addObject("blog", blog);
	     mv.setViewName("test");
	   
		repo.save(blog);
		 return mv;
	}
	@RequestMapping("/saveblog")
	public ModelAndView addBlog(WriteBlog contents) {
	     ModelAndView mv = new ModelAndView();

	     mv.addObject("contents", contents);
	     mv.setViewName("userView");
	   
		writeBlog.save(contents);
		 return mv;
	}
}
