package br.com.cannoni.template.model.dao;

import java.io.Serializable;
import java.util.List;

import br.com.cannoni.template.model.entity.User;

/**
 * @author patrizio
 * @since 30/08/2017
 *
 */
public interface UsersDAO extends Serializable {

    List<User> getUsers();
    
    void insertUser(User user);
    
}
