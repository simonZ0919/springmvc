package annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("service")
@Scope("prototype")
public class UserService {
	// @Autowired(byType), Resource(byName(1st)/byType)
	@Resource(name = "dao")
	private Dao userDao;
	
	public void login() {
		System.out.println(userDao);
	}
}
