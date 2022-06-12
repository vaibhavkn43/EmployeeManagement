package com.cdac.hcdc.EmpM.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//this class is replacement of []servletname]-servlet.xml file or config file..
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.cdac.hcdc" })
public class EmployeeAppConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver viewResolver()  {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource());
		
		return jdbcTemplate;
	}
	
	
	@Bean
	public DataSource dataSource(){
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/cdac_hcdc?useSSl=false");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return dataSource;
	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		/*
		 * registry.addResourceHandler("/URLToReachResourcesFolder/**")
		 * .addResourceLocations("/Employee-Management/src/main/webapp/resources")
		 */
		
		registry.addResourceHandler("/URLToReachResourcesFolder/**")
		.addResourceLocations("/resources/");
		
		registry.addResourceHandler("/URLToReachImagesFolder/**")
				.addResourceLocations("/resources/images/");
	}
	
	
	
	
}
