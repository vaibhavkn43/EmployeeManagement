package com.cdac.hcdc.EmpM.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//web.xml file replacement
//this is a front end controller from where mvc appliction starts 
//front controller is dispature servlet
// we configured  it


public class EmployeeAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//Class[] configFiles= {EmployeeAppConfig.class ,etc classes};
		Class[] configFiles= {EmployeeAppConfig.class};
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		//String[] mappings = {"/", "/xyz",};
		String[] mappings = {"/"};
		return mappings;
	}

}
