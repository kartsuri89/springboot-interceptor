package io.suriya;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new GeneralPurposeHandler());
		registry.addInterceptor(new SingleSpecificHandler()).addPathPatterns("/users/**");
	}
}
