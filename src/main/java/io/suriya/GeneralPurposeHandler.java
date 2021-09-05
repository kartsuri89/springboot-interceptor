package io.suriya;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class GeneralPurposeHandler implements HandlerInterceptor {
	
	private final Logger log = LoggerFactory.getLogger(GeneralPurposeHandler.class);
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
				log.info("Inside preHandle() of GeneralPurposeHandler");
				return true;
		
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		log.info("Inside postHandle() of GeneralPurposeHandler");
	}
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
		log.info("Inside afterCompletion() of GeneralPurposeHandler");
	}
	

}
