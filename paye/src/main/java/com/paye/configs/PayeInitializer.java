package com.paye.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import java.util.logging.Filter;

public class PayeInitializer  extends  AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{PayeConfig.class};
    }


    protected Class<?>[] getServletConfigClasses() {
        return null;
    }


    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    protected Filter[] getServletFilters() {
        Filter[] singleton = { new CORSFilter()};
        return singleton;
    }

}