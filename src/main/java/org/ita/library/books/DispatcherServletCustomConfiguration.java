/**
 * 
 */
package org.ita.library.books;

import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 
 * @author ayyappamuthusami
 * @version 1.0
 */
@Configuration
public class DispatcherServletCustomConfiguration {

	@Bean
	public DispatcherServlet dispatcherServlet() {
		return new DispatcherServlet();
	}
	
	@Bean
	public ServletRegistrationBean dispatcherServletRegistration() {
		ServletRegistrationBean bean = new ServletRegistrationBean(dispatcherServlet(), "/ita/library/books/*");
		bean.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
		return bean;
	}
}
