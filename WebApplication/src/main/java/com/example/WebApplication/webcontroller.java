package com.example.WebApplication;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.WebApplication.model.Blog;
import com.example.WebApplication.model.WriteBlog;
import com.example.WebApplication.repo.BlogRepository;
import com.example.WebApplication.repo.WriteBlogRepository;
@Controller
@RestController
@CrossOrigin(origins = "http://localhost:4200")
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
			return "errorMessage";
		}
	}
	/*@RequestMapping("/culture")
	public ModelAndView displayCultureBlog() {
	
		ModelAndView mv = new ModelAndView("displayCultureBlogs");
		Iterable<WriteBlog> blogs=writeBlog.findAll();
	     mv.addObject("blogs",blogs);
	     System.out.println(blogs);
		 return mv;
	}*/
	
	@RequestMapping("/culture")
	public ModelAndView displayCultureBlog() {
		ModelAndView mv = new ModelAndView("displayCultureBlogs");
		List<WriteBlog> blogs=writeBlog.findByTag("Culture");
	     mv.addObject("blogs",blogs);
	     //System.out.println(blogs);
		 return mv;
	}
	@RequestMapping("/place")
	public ModelAndView displayPlacesBlog() {
		ModelAndView mv = new ModelAndView("displayCultureBlogs");
		List<WriteBlog> blogs=writeBlog.findByTag("Place");
	     mv.addObject("blogs",blogs);
	    // System.out.println(blogs);
		 return mv;
	}
	@RequestMapping("/food")
	public ModelAndView displayFoodBlog() {
		ModelAndView mv = new ModelAndView("displayCultureBlogs");
		List<WriteBlog> blogs=writeBlog.findByTag("Food");
	     mv.addObject("blogs",blogs);
	     //System.out.println(blogs);
		 return mv;
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
	
	@GetMapping("/userDetails")
	public List<Blog> getUsers(){
		return (List<Blog>) repo.findAll();
	}
	
	@PostMapping("/addfromAngular")
	void add(@RequestBody Blog user) {
		System.out.println("Inside add from angular");
        repo.save(user);
    }
		
	
}
