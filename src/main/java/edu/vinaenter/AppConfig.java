package edu.vinaenter;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScans({ @ComponentScan("edu.vinaenter") })
@EnableWebMvc
public class AppConfig {

	@Bean("viewResolver")
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages/messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

	@Bean(name = "multipartResolver")
	public MultipartResolver getMultipartResolver() {
		CommonsMultipartResolver resover = new CommonsMultipartResolver();
		// resover.setMaxUploadSize(1 * 1024 * 1024);
		return resover;
	}
}
