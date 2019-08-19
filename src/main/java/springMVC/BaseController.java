package springMVC;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

// parent class for all controllers
public class BaseController {
	// handle exception
	@ExceptionHandler({NullPointerException.class, ClassCastException.class})
	public String handleException(Exception e) {
		if(e instanceof NullPointerException) {
			return "ex";
		}
		return null;
	}
}
