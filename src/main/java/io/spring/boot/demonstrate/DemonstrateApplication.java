package io.spring.boot.demonstrate;

import io.spring.boot.demonstrate.domain.Role;
import io.spring.boot.demonstrate.domain.User;
import io.spring.boot.demonstrate.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class DemonstrateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemonstrateApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(UserService userService){
//		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//
//			userService.saveUSer(new User(null, "Ulugbek", "ulugbek", "123456", new ArrayList<>()));
//			userService.saveUSer(new User(null, "Mardonbek", "mardon", "123456", new ArrayList<>()));
//
//
//			userService.addRoleToUser("ulugbek", "ROLE_ADMIN");
//			userService.addRoleToUser("mardon", "ROLE_USER");
//		};
//	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
