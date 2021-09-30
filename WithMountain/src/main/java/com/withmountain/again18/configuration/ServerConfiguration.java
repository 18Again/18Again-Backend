package com.withmountain.again18.configuration;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.withmountain.again18.interceptor.LoginInterceptor;

@Configuration
public class ServerConfiguration implements WebMvcConfigurer {
	
	private static final List<String> URL_PATTERNS = Arrays.asList("/users/*", "/logout");
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		 registry.addInterceptor(new LoginInterceptor()).addPathPatterns(URL_PATTERNS); 
	}
}
