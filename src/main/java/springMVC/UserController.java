package springMVC;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Controller
// path: /springmvc/user/*
@RequestMapping("user")
public class UserController extends BaseController {
	//map request with method
	@RequestMapping("reg.do")
	public String userRegister() {
		// dispatch to reg.jsp
		return "reg";
	}
	
	@RequestMapping("login.do")
	public String userLogin() {
		return "login";
	}
	
	/**
	 * get request params by: HttpServletRequest;
	 * parameters(same name/type), @RequestParam("requestname");
	 * create class with request params
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("regHandler.do")	
//	public String reqHandler(HttpServletRequest request) {
//		String username=request.getParameter("username");
//		String pwd=request.getParameter("pwd");
//		return null;
//	}	
	public String reqHandler(User user, HttpServletRequest request )  {
		//if username=root, dispatch to error.jsp
		if("root".equals(user.username)) {
			String message="username exists";
			request.setAttribute("msg", message);
			return "error";
		}
		// redirect:path, redirect to login.do
		return "redirect:login.do";
	}
	
	// specify request value and method
	@RequestMapping(value = "loginHandler.do", method = RequestMethod.POST)
	public String loginHandler(String username, 
			@RequestParam(value = "pwd",required = false) String pwd, 
			ModelMap modelMap, HttpSession session ) {
		if ("root".equals(username) && "123".equals(pwd)) {
			session.setAttribute("username", username);
			return "redirect:index.do";
		} else {
			String message="invalid username/password";
			modelMap.addAttribute("msg", message);
			return "error";
		}
	}
	
	@RequestMapping("index.do")
	public String index() {
		return "index";
	}
	
	@RequestMapping("logout.do")
	public String userLogout(HttpSession session) {
		// clear session
		session.invalidate();
		return "redirect:login.do";
	}
	
	@RequestMapping({"null.do","pointer.do"})
	public String showNull(String name) {
		int length=name.length();
		return null;
	}	
}

