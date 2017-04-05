package webApp.action;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import webApp.Pojo.User;
import webApp.dao.UserDao;
import webApp.server.LoginServer;

@Controller
@RequestMapping("/hello")
public class HelloAction {
	
	@Resource(name="loginServerImpl")
	LoginServer loginServer;
	
	
	
	@RequestMapping("/sayHello")
	public String hello(HttpServletRequest request,Model model){
		
		Collection<User> users = loginServer.getAllUser();
		
		for(User user : users){
			System.out.println("user name : " + user.getName());
			System.out.println("user id : " + user.getId());
			System.out.println("user password : " + user.getPassword());
			System.out.println("user email : " + user.getEmail());
		}
		
		request.setAttribute("users", users);
		
		return "Hello";
	}
}
