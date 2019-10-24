package com.harshsanjay.spring.config;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.harshsanjay.spring.controller"})
public class WebConfig implements WebMvcConfigurer{

//	private static final Charset UTF8 = Charset.forName("UTF-8");
//
//	  @Override
//	  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//	    StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
//	    stringConverter.setSupportedMediaTypes(Arrays.asList(new MediaType("Application", "Json", UTF8)));
//	    converters.add(stringConverter);
//	  }
}
