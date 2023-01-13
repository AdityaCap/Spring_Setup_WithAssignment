package com.shopping.main;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ShopInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?>[] classes = new Class[] { ShopServlet.class };
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapping = new String[] { "/", "/Cart", "/Contact", "/Categories", "/Products" };

		return mapping;
	}

}
