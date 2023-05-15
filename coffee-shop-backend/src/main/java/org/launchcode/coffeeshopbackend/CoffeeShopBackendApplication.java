package org.launchcode.coffeeshopbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.Map;

@SpringBootApplication
public class CoffeeShopBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeShopBackendApplication.class, args);
	}

	@RequestMapping("/token")
	public Map<String,String> token(HttpSession session) {
		return Collections.singletonMap("token", session.getId());
	}
}