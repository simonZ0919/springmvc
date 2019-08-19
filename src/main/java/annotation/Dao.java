package annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component/Service/Controller/Repository: module, default name:dao
@Component("dao")
@Lazy(false)
public class Dao {
	public Dao() {
		System.out.println("construct dao");
	}
	
	//init-method
	@PostConstruct
	public void init() {}
	
	//destroy-method
	@PreDestroy
	public void destroy() {}
}
