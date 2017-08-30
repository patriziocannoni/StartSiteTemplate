package br.com.cannoni.template.view.mbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.com.cannoni.template.model.dto.UserDTO;
import br.com.cannoni.template.model.service.UsersService;

/**
 * @author patrizio
 * @since 30/08/2017
 *
 */
@ManagedBean
@ViewScoped
public class UsersMB implements Serializable {
    
    private static final long serialVersionUID = -1440582286228616437L;

    private List<UserDTO> users;
    
    @ManagedProperty(value = "#{usersService}")
    private UsersService usersService;
    
    @PostConstruct
    private void init() {
        users = usersService.getUsers();
    }
    
    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }
    
}
