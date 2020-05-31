package ps.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class SpringCloudM4SecureAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudM4SecureAuthServerApplication.class, args);
	}
	
	/**
	 * authenticate users thats comes from the other server.
	 * what it does   when these other service  says hi is this token valid ? they will also make sure if this user is also valid.
	 */
	
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
	

}
