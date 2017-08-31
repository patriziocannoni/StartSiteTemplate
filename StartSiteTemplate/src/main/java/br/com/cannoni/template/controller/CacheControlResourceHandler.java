package br.com.cannoni.template.controller;

import javax.faces.application.Resource;
import javax.faces.application.ResourceHandler;
import javax.faces.application.ResourceHandlerWrapper;

/**
 * @author patrizio
 * @since 17/08/2017
 * 
 */
public class CacheControlResourceHandler extends ResourceHandlerWrapper {
	
	private static final long now = System.currentTimeMillis();
	
	private ResourceHandler wrapped;
	
	static long getStartUpTime() {
		return now;
	}
	
	public CacheControlResourceHandler(ResourceHandler resourceHandler) {
        super();
        this.wrapped = resourceHandler;
    }
	
	@Override
	public ResourceHandler getWrapped() {
		return wrapped;
	}
	
	@Override
	public Resource createResource(String resourceName, String libraryName) {
		Resource resource = super.createResource(resourceName, libraryName);
		if (resource != null && libraryName != null && !libraryName.equalsIgnoreCase("javax.faces")) {
			return new CacheControlResource(resource);
		}
		return resource;
	}

}
