package br.com.cannoni.template.view.mbeans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import br.com.cannoni.template.model.dto.UserDTO;

/**
 * @author patrizio
 * @since 30/08/2017
 * 
 */
@ManagedBean
@SessionScoped
public class UserSessionBean implements Serializable {
	
	private static final long serialVersionUID = -509204933607613919L;
	
	private static final Logger LOGGER = Logger.getLogger(UserSessionBean.class);
	
	private UserDTO currentUser;
	
	@PostConstruct
	private void init() {
		LOGGER.info("UserSessionBean::init");
	}
	
	public String signOut() {
		currentUser = null;
		return null;
	}

	public UserDTO getCurrentUser() {
		return currentUser;
	}
	
}
