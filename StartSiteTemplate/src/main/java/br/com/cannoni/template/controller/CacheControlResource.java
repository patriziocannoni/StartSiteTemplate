package br.com.cannoni.template.controller;

import java.io.Serializable;

import javax.faces.application.Resource;
import javax.faces.application.ResourceWrapper;

/**
 * @author patrizio
 * @since 17/08/2017
 * 
 */
public class CacheControlResource extends ResourceWrapper implements Serializable {
	
	private static final long serialVersionUID = -7294762290344977813L;
	
	private Resource wrapped;
	
	public CacheControlResource(Resource wrapped) {
		this.wrapped = wrapped;
	}
	
	@Override
	public Resource getWrapped() {
		return wrapped;
	}
	
	@Override
	public String getRequestPath() {
		return super.getRequestPath() + "&amp;v=" + CacheControlResourceHandler.getStartUpTime();
	}
	
	@Override
	public String getContentType() {
		return wrapped.getContentType();
	}
	
	@Override
	public String getLibraryName() {
		return wrapped.getLibraryName();
	}
	
	@Override
	public String getResourceName() {
		return wrapped.getResourceName();
	}
	
	@Override
	public void setContentType(String contentType) {
		wrapped.setContentType(contentType);
	}
	
	@Override
	public void setLibraryName(String libraryName) {
		wrapped.setLibraryName(libraryName);
	}
	
	@Override
	public void setResourceName(String resourceName) {
		wrapped.setResourceName(resourceName);
	}
	
	@Override
	public String toString() {
		return wrapped.toString();
	}

}
